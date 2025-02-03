package com.project.education_app.service.impl;

import com.project.education_app.dtos.AttendanceDto;
import com.project.education_app.entities.Assignment;
import com.project.education_app.entities.Attendance;
import com.project.education_app.entities.Course;
import com.project.education_app.entities.Student;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.AttendanceMapper;
import com.project.education_app.mappers.BasicStudentMapper;
import com.project.education_app.mappers.CourseMapper;
import com.project.education_app.repos.AttendanceRepo;
import com.project.education_app.repos.CourseRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {

    private final AttendanceRepo attendanceRepo;
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;
    private final AttendanceMapper attendanceMapper;
    private final BasicStudentMapper basicStudentMapper;
    private final CourseMapper courseMapper;

    @Override
    public AttendanceDto createAttendance(AttendanceDto attendanceDto) {
        Student student = studentRepo.findById(attendanceDto.getStudent().getId())
                .orElseThrow(() -> new NotFoundException("Student not found with id:" + attendanceDto.getStudent().getId()));
        Course course = courseRepo.findById(attendanceDto.getCourse().getId())
                .orElseThrow(() -> new NotFoundException("Course not found with id:" + attendanceDto.getCourse().getId()));

        Attendance attendance = attendanceMapper.dtoToEntity(attendanceDto);
        attendance.setStudent(student);
        attendance.setCourse(course);

        Attendance savedAttendance = attendanceRepo.save(attendance);
        AttendanceDto savedAttendanceDto = attendanceMapper.entityToDto(savedAttendance);

        savedAttendanceDto.setStudent(basicStudentMapper.entityToDto(savedAttendance.getStudent()));
        savedAttendanceDto.setCourse(courseMapper.entityToBasicDto(savedAttendance.getCourse()));

        return savedAttendanceDto;
    }

    @Override
    public AttendanceDto updateAttendance(Long id, AttendanceDto attendanceDto) {
        Attendance attendance = attendanceRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Attendance not found with id:" + id));

        if (attendanceDto.getAttendanceDate() != null) {
            attendance.setAttendanceDate(attendanceDto.getAttendanceDate());
        }
        if (attendanceDto.isPresent() != attendance.isPresent()) {
            attendance.setPresent(attendanceDto.isPresent());
        }
        if (attendanceDto.getStudent() != null) {
            Student student = studentRepo.findById(attendanceDto.getStudent().getId())
                    .orElseThrow(() -> new NotFoundException("Student not found with id:" + attendanceDto.getStudent().getId()));
            attendance.setStudent(student);
        }
        if (attendanceDto.getCourse() != null) {
            Course course = courseRepo.findById(attendanceDto.getCourse().getId())
                    .orElseThrow(() -> new NotFoundException("Course not found with id:" + attendanceDto.getCourse().getId()));
            attendance.setCourse(course);
        }

        Attendance updatedAttendance = attendanceRepo.save(attendance);
        AttendanceDto updatedAttendanceDto = attendanceMapper.entityToDto(updatedAttendance);

        updatedAttendanceDto.setStudent(basicStudentMapper.entityToDto(updatedAttendance.getStudent()));
        updatedAttendanceDto.setCourse(courseMapper.entityToBasicDto(updatedAttendance.getCourse()));

        return updatedAttendanceDto;
    }

    @Override
    public AttendanceDto getAttendanceById(Long id) {
        Attendance attendance = attendanceRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Attendance not found with id:" + id));
        return attendanceMapper.entityToDto(attendance);
    }

    @Override
    public void deleteAttendance(Long id) {
        attendanceRepo.deleteById(id);
    }

    @Override
    public List<AttendanceDto> findAttendancesByStudent(Long studentId) {
        return attendanceRepo.findByStudentId(studentId).stream()
                .map(attendanceMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AttendanceDto> findAttendancesByCourse(Long courseId) {
        return attendanceRepo.findByCourseId(courseId).stream()
                .map(attendanceMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AttendanceDto> findAttendancesByDate(LocalDate attendanceDate) {
        List<Attendance> attendances = attendanceRepo.findByAttendanceDate(attendanceDate);
        return attendanceMapper.entitiesToDtos(attendances);
    }

    @Override
    public List<AttendanceDto> getAllAttendances() {
        return attendanceRepo.findAll().stream()
                .map(attendanceMapper::entityToDto)
                .collect(Collectors.toList());
    }
}
