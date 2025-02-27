package com.project.education_app.service;

import com.project.education_app.dtos.ScheduleDto;

import java.util.List;

public interface ScheduleService {
    ScheduleDto save(ScheduleDto scheduleDto);

    List<ScheduleDto> findAll();

    ScheduleDto findById(Long id);

    ScheduleDto update(Long id, ScheduleDto scheduleDto);

    void delete(Long id);

    List<ScheduleDto> findByName(String name);

    List<ScheduleDto> findByDescription(String description);

    List<ScheduleDto> findByStudent(Long studentId);

    List<ScheduleDto> findByCoursesId(Long coursesId);

    List<ScheduleDto> findBySemester(Long semesterId);

    ScheduleDto assignCourses(Long id, List<Long> courseIds);
}
