package com.project.education_app.repos;

import com.project.education_app.dtos.BasicFacultyDto;
import com.project.education_app.entities.Assignment;
import com.project.education_app.entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment,Long> {
    List<Assignment> findByTitleContaining(String title);

    List<Assignment> findByTeacherId(Long teacherId);

    List<Assignment> findByDueDate(Date dueDate);

    List<Assignment> findByCompleted(boolean completed);
}
