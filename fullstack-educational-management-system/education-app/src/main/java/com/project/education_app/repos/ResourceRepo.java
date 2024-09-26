package com.project.education_app.repos;

import com.project.education_app.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepo extends JpaRepository<Resource,Long> {
    List<Resource> findByResourceNameContaining(String resourceName);

    List<Resource> findByUrlContaining(String url);

    List<Resource> findBySyllabusId(Long syllabusId);

    List<Resource> findByCourseId(Long courseId);
}
