package com.project.education_app.repos;

import com.project.education_app.entities.Syllabus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SyllabusRepo extends JpaRepository<Syllabus,Long> {
    List<Syllabus> findByObjectivesContaining(String objectives);

    List<Syllabus> findByTopicsContaining(String topics);

    List<Syllabus> findByEvaluationCriteriaContaining(String evaluationCriteria);

    List<Syllabus> findByCourseId(Long courseId);

    List<Syllabus> findByAssignmentsId(Long assignmentId);

    List<Syllabus> findByProjectsId(Long projectId);

    List<Syllabus> findByTestsId(Long testId);

    List<Syllabus> findByResourcesId(Long resourceId);
}
