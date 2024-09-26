package com.project.education_app.repos;

import com.project.education_app.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long> {
    List<Project> findByNameContaining(String name);

    List<Project> findByTeacherId(Long teacherId);

    List<Project> findByStudentsId(Long studentId);

    List<Project> findByCompleted(boolean completed);

    List<Project> findBySyllabusId(Long syllabusId);
}
