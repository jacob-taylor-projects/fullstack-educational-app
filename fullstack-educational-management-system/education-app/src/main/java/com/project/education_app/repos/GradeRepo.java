package com.project.education_app.repos;

import com.project.education_app.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepo extends JpaRepository<Grade,Long> {
    List<Grade> findByGrade(double grade);

    List<Grade> findByGradeGreaterThan(double grade);

    List<Grade> findByStudentId(Long studentId);

    List<Grade> findByTeacherId(Long teacherId);

    List<Grade> findByCourseId(Long courseId);

    List<Grade> findBySubmissionId(Long submissionId);

    List<Grade> findByCourseGradeId(Long courseGradeId);
}
