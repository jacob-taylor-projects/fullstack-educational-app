package com.project.education_app.service;

import com.project.education_app.dtos.GradeDto;

import java.util.List;

public interface GradeService {

    GradeDto save(GradeDto gradeDto);

    List<GradeDto> findAll();

    GradeDto findById(Long id);

    GradeDto update(Long id, GradeDto gradeDto);

    void delete(Long id);

    List<GradeDto> findByGrade(double grade);

    List<GradeDto> findByGradeGreaterThan(double grade);

    List<GradeDto> findByStudent(Long studentId);

    List<GradeDto> findByTeacher(Long teacherId);

    List<GradeDto> findByCourse(Long courseId);

    List<GradeDto> findBySubmission(Long submissionId);

    List<GradeDto> findByCourseGrade(Long courseGradeId);
}
