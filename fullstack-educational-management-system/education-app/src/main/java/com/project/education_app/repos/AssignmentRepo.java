package com.project.education_app.repos;

import com.project.education_app.entities.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment,Long> {
    List<Assignment> findByTitleContaining(String title);

    List<Assignment> findByTeacherId(Long teacherId);

    List<Assignment> findByDueDate(LocalDate dueDate);

    List<Assignment> findByCompleted(boolean completed);
}
