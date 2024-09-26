package com.project.education_app.repos;

import com.project.education_app.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepo extends JpaRepository<Lesson,Long> {
    List<Lesson> findByTitleContaining(String title);

    List<Lesson> findByContentContaining(String content);

    List<Lesson> findByAuthorId(Long id);

    List<Lesson> findByUnitId(Long unitId);
}
