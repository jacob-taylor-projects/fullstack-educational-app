package com.project.education_app.service;

import com.project.education_app.dtos.CourseDto;
import com.project.education_app.dtos.CourseGradeDto;
import com.project.education_app.dtos.FullCourseDto;

import java.util.List;

public interface CourseService {
    CourseDto save(CourseDto courseDto);

    List<FullCourseDto> findAll();

    FullCourseDto findById(Long id);

    CourseDto update(Long id, CourseDto courseDto);

    void delete(Long id);

    List<FullCourseDto> findByName(String name);

    List<FullCourseDto> findBySubject(String subject);

    List<FullCourseDto> findBySyllabus(Long syllabusId);

    List<FullCourseDto> findByStudents(Long studentId);

    List<FullCourseDto> findByGrades(Long gradeId);

    List<FullCourseDto> findByCourseGrades(Long courseGradeId);

    List<FullCourseDto> findByResources(Long resourceId);

    List<FullCourseDto> findByUnits(Long unitId);

    List<FullCourseDto> findBySchedules(Long scheduleId);

    List<FullCourseDto> findBySemesters(Long semesterId);

    FullCourseDto assignUnits(Long id, List<Long> unitIds);

    FullCourseDto assignStudents(Long id, List<Long> studentIds);

    FullCourseDto assignGrades(Long id, List<Long> gradeIds);

    FullCourseDto assignResources(Long id, List<Long> resourceIds);

    FullCourseDto assignSchedules(Long id, List<Long> scheduleIds);
}

