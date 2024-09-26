package com.project.education_app.repos;

import com.project.education_app.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepo extends JpaRepository<Schedule,Long> {
    List<Schedule> findByNameContaining(String name);

    List<Schedule> findByDescriptionContaining(String description);

    List<Schedule> findByStudentId(Long studentId);

    List<Schedule> findByCoursesId(Long courseId);

    List<Schedule> findBySemesterId(Long semesterId);

}
