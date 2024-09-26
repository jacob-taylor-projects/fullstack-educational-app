package com.project.education_app.repos;

import com.project.education_app.entities.Course;
import com.project.education_app.entities.CourseGrade;
import com.project.education_app.entities.Grade;
import com.project.education_app.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseGradeRepo extends JpaRepository<CourseGrade,Long> {
    List<CourseGrade> findByStudentId(Long studentId);

    List<CourseGrade> findByCourseId(Long courseId);

    List<CourseGrade> findByOverallGradeGreaterThan(double overallGrade);

    List<CourseGrade> findByGrades(Grade grade);
}
