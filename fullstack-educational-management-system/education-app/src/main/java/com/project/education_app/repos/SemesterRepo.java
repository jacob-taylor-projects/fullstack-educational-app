package com.project.education_app.repos;

import com.project.education_app.entities.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SemesterRepo extends JpaRepository<Semester,Long> {
    List<Semester> findByNameContaining(String name);

    List<Semester> findByYearContaining(String year);

    List<Semester> findBySchedulesId(Long scheduleId);

    List<Semester> findByCoursesId(Long courseId);

}
