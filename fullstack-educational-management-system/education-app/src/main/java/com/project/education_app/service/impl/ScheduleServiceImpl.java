package com.project.education_app.service.impl;

import com.project.education_app.dtos.ScheduleDto;
import com.project.education_app.entities.*;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.ScheduleMapper;
import com.project.education_app.repos.CourseRepo;
import com.project.education_app.repos.ScheduleRepo;
import com.project.education_app.repos.SemesterRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepo scheduleRepo;
    private final StudentRepo studentRepo;
    private final SemesterRepo semesterRepo;
    private final CourseRepo courseRepo;
    private final ScheduleMapper scheduleMapper;

    @Override
    public ScheduleDto save(ScheduleDto scheduleDto) {
        Student student = studentRepo.findById(scheduleDto.getStudent().getId())
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + scheduleDto.getStudent().getId()));
        Semester semester = semesterRepo.findById(scheduleDto.getSemester().getId())
                .orElseThrow(() -> new NotFoundException("Semester not found with id: " + scheduleDto.getSemester().getId()));
        Schedule schedule = scheduleMapper.dtoToEntity(scheduleDto);
        schedule.setStudent(student);
        schedule.setSemester(semester);
        Schedule savedSchedule = scheduleRepo.save(schedule);
        return scheduleMapper.entityToDto(savedSchedule);
    }

    @Override
    public List<ScheduleDto> findAll() {
        List<Schedule> schedules = scheduleRepo.findAll();
        return schedules.stream().map(scheduleMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public ScheduleDto findById(Long id) {
        Schedule schedule = scheduleRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Schedule not found with id: " + id));
        return scheduleMapper.entityToDto(schedule);
    }

    @Override
    public ScheduleDto update(Long id, ScheduleDto scheduleDto) {
        Schedule schedule = scheduleRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Schedule not found with id: " + id));

        if (scheduleDto.getName() != null) {
            schedule.setName(scheduleDto.getName());
        }
        if (scheduleDto.getDescription() != null) {
            schedule.setDescription(scheduleDto.getDescription());
        }
        if (scheduleDto.getStudent() != null) {
            Student student = studentRepo.findById(scheduleDto.getStudent().getId())
                    .orElseThrow(() -> new NotFoundException("Student not found with id: " + scheduleDto.getStudent().getId()));
            schedule.setStudent(student);
        }
        if (scheduleDto.getSemester() != null) {
            Semester semester = semesterRepo.findById(scheduleDto.getSemester().getId())
                    .orElseThrow(() -> new NotFoundException("Semester not found with id: " + scheduleDto.getSemester().getId()));
            schedule.setSemester(semester);
        }

        Schedule updatedSchedule = scheduleRepo.save(schedule);
        return scheduleMapper.entityToDto(updatedSchedule);
    }

    @Override
    public void delete(Long id) {
        Schedule schedule = scheduleRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Schedule not found with id: " + id));
        scheduleRepo.delete(schedule);
    }

    @Override
    public List<ScheduleDto> findByName(String name) {
        List<Schedule> schedules = scheduleRepo.findByNameContaining(name);
        return schedules.stream().map(scheduleMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<ScheduleDto> findByDescription(String description) {
        List<Schedule> schedules = scheduleRepo.findByDescriptionContaining(description);
        return schedules.stream().map(scheduleMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<ScheduleDto> findByStudent(Long studentId) {
        List<Schedule> schedules = scheduleRepo.findByStudentId(studentId);
        return schedules.stream().map(scheduleMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<ScheduleDto> findByCoursesId(Long coursesId) {
        List<Schedule> schedules = scheduleRepo.findByCoursesId(coursesId);
        return schedules.stream().map(scheduleMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<ScheduleDto> findBySemester(Long semesterId) {
        List<Schedule> schedules = scheduleRepo.findBySemesterId(semesterId);
        return schedules.stream().map(scheduleMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public ScheduleDto assignCourses(Long id, List<Long> courseIds) {
        Schedule schedule = scheduleRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Schedule not found with id: " + id));
        List<Course> courses = courseRepo.findAllById(courseIds);
        schedule.setCourses(courses);
        Schedule updatedSchedule = scheduleRepo.save(schedule);
        return scheduleMapper.entityToDto(updatedSchedule);
    }
}
