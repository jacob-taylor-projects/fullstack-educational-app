package com.project.education_app.repos;

import com.project.education_app.entities.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitRepo extends JpaRepository<Unit,Long> {
    List<Unit> findByNameContaining(String name);

    List<Unit> findByDescriptionContaining(String description);

    List<Unit> findByLessonsId(Long lessonId);
}
