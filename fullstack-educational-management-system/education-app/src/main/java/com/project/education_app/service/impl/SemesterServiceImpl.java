package com.project.education_app.service.impl;

import com.project.education_app.dtos.SemesterDto;
import com.project.education_app.entities.Course;
import com.project.education_app.entities.Schedule;
import com.project.education_app.entities.Semester;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.SemesterMapper;
import com.project.education_app.repos.CourseRepo;
import com.project.education_app.repos.ScheduleRepo;
import com.project.education_app.repos.SemesterRepo;
import com.project.education_app.service.SemesterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SemesterServiceImpl implements SemesterService {

    private final SemesterRepo semesterRepo;
    private ScheduleRepo scheduleRepo;
    private CourseRepo courseRepo;
    private SemesterMapper semesterMapper;

    @Override
    public SemesterDto save(SemesterDto semesterDto) {
        Semester semester = semesterMapper.dtoToEntity(semesterDto);
        Semester savedSemester = semesterRepo.save(semester);
        return semesterMapper.entityToDto(savedSemester);
    }

    @Override
    public List<SemesterDto> findAll() {
        List<Semester> semesters = semesterRepo.findAll();
        return semesters.stream().map(semesterMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public SemesterDto findById(Long id) {
        Semester semester = semesterRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Semester not found with id: " + id));
        return semesterMapper.entityToDto(semester);
    }

    @Override
    public SemesterDto update(Long id, SemesterDto semesterDto) {
        Semester semester = semesterRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Semester not found with id: " + id));

        if (semesterDto.getName() != null) {
            semester.setName(semesterDto.getName());
        }
        if (semesterDto.getYear() != null) {
            semester.setYear(semesterDto.getYear());
        }

        Semester updatedSemester = semesterRepo.save(semester);
        return semesterMapper.entityToDto(updatedSemester);
    }

    @Override
    public void delete(Long id) {
        Semester semester = semesterRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Semester not found with id: " + id));
        semesterRepo.delete(semester);
    }

    @Override
    public List<SemesterDto> findByName(String name) {
        List<Semester> semesters = semesterRepo.findByNameContaining(name);
        return semesters.stream().map(semesterMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SemesterDto> findByYear(String year) {
        List<Semester> semesters = semesterRepo.findByYearContaining(year);
        return semesters.stream().map(semesterMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SemesterDto> findBySchedulesId(Long schedulesId) {
        List<Semester> semesters = semesterRepo.findBySchedulesId(schedulesId);
        return semesters.stream().map(semesterMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SemesterDto> findByCoursesId(Long coursesId) {
        List<Semester> semesters = semesterRepo.findByCoursesId(coursesId);
        return semesters.stream().map(semesterMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public SemesterDto assignSchedules(Long id, List<Long> scheduleIds) {
        Semester semester = semesterRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Semester not found with id: " + id));
        List<Schedule> schedules = scheduleRepo.findAllById(scheduleIds);
        semester.setSchedules(schedules);
        Semester updatedSemester = semesterRepo.save(semester);
        return semesterMapper.entityToDto(updatedSemester);
    }

    @Override
    public SemesterDto assignCourses(Long id, List<Long> courseIds) {
        Semester semester = semesterRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Semester not found with id: " + id));
        List<Course> courses = courseRepo.findAllById(courseIds);
        semester.setCourses(courses);
        Semester updatedSemester = semesterRepo.save(semester);
        return semesterMapper.entityToDto(updatedSemester);
    }
}