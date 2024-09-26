package com.project.education_app.repos;

import com.project.education_app.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback,Long> {
    List<Feedback> findByFeedbackTextContaining(String feedbackText);

    List<Feedback> findBySubmissionId(Long submissionId);


}
