package com.project.education_app.repos;

import com.project.education_app.entities.Project;
import com.project.education_app.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TestRepo extends JpaRepository<Test,Long> {
    List<Test> findByTitleContaining(String title);

    List<Test> findByTeacherId(Long teacherId);

    List<Test> findByStudentsId(Long studentId);

    List<Test> findByCompleted(boolean completed);

    List<Test> findBySyllabusId(Long syllabusId);

    List<Test> findByDueDate(LocalDate dueDate);
}
