package com.project.education_app.repos;

import com.project.education_app.entities.ProblemAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProblemAnswerRepo extends JpaRepository<ProblemAnswer, Long> {
    List<ProblemAnswer> findByProblemContentContaining(String problemContent);

    List<ProblemAnswer> findByAnswerContentContaining(String answerContent);

    List<ProblemAnswer> findByProjectId(Long projectId);

    List<ProblemAnswer> findByAssignmentId(Long assignmentId);

    List<ProblemAnswer> findByTestId(Long testId);
}

