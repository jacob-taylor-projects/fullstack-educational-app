package com.project.education_app.repos;

import com.project.education_app.entities.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissionRepo extends JpaRepository<Submission, Long> {
    List<Submission> findByContentContaining(String content);

    List<Submission> findByStudentId(Long studentId);

    List<Submission> findByGradeId(Long gradeId);

    List<Submission> findByFeedbackId(Long feedbackId);
}

