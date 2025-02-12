package com.project.education_app.service;

import com.project.education_app.dtos.CourseGradeDto;
import com.project.education_app.dtos.GradeDto;

import java.util.List;

public interface CourseGradeService {
    CourseGradeDto createCourseGrade(CourseGradeDto courseGradeDto);

    List<CourseGradeDto> findAll();

    CourseGradeDto findById(Long id);

    CourseGradeDto update(Long id, CourseGradeDto courseGradeDto);

    void delete(Long id);

    List<CourseGradeDto> findByStudent(Long studentId);

    List<CourseGradeDto> findByCourse(Long courseId);

    List<CourseGradeDto> findByGradeGreaterThan(double grade);

    CourseGradeDto assignGrades(Long id, List<Long> gradeIds);
}
