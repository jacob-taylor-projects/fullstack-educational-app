package com.project.education_app.service;

import com.project.education_app.dtos.SemesterDto;

import java.util.List;

public interface SemesterService {
    SemesterDto save(SemesterDto semesterDto);

    List<SemesterDto> findAll();

    SemesterDto findById(Long id);

    SemesterDto update(Long id, SemesterDto semesterDto);

    void delete(Long id);

    List<SemesterDto> findByName(String name);

    List<SemesterDto> findByYear(String year);

    List<SemesterDto> findBySchedulesId(Long schedulesId);

    List<SemesterDto> findByCoursesId(Long coursesId);

    SemesterDto assignSchedules(Long id, List<Long> scheduleIds);

    SemesterDto assignCourses(Long id, List<Long> courseIds);
}
