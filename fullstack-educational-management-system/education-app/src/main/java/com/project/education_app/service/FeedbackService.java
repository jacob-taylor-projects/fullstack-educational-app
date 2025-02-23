package com.project.education_app.service;

import com.project.education_app.dtos.FeedbackDto;

import java.util.List;

public interface FeedbackService {
    FeedbackDto save(FeedbackDto feedbackDto);

    List<FeedbackDto> findAll();

    FeedbackDto findById(Long id);

    FeedbackDto update(Long id, FeedbackDto feedbackDto);

    void delete(Long id);

    List<FeedbackDto> findByText(String text);

    List<FeedbackDto> findBySubmission(Long submissionId);
}
