package com.project.education_app.repos;

import com.project.education_app.entities.Course;
import com.project.education_app.entities.Semester;
import com.project.education_app.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
    List<Course> findByName(String name);

    List<Course> findBySubject(String subject);

    List<Course> findBySyllabusId(Long syllabusId);

    List<Course> findByStudentsId(Long studentId);

    List<Course> findByGradesId(Long gradeId);

    List<Course> findByCourseGradesId(Long courseGradeId);

    List<Course> findByResourcesId(Long resourceId);

    List<Course> findByUnitsId(Long unitId);

    List<Course> findBySchedulesId(Long scheduleId);

    List<Course> findBySemestersId(Long semesterId);

    Course findById(long id);
}
