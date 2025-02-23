package com.project.education_app.service.impl;

import com.project.education_app.dtos.FeedbackDto;
import com.project.education_app.entities.Feedback;
import com.project.education_app.entities.Submission;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.FeedbackMapper;
import com.project.education_app.repos.FeedbackRepo;
import com.project.education_app.repos.SubmissionRepo;
import com.project.education_app.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepo feedbackRepo;
    private final SubmissionRepo submissionRepo;
    private final FeedbackMapper feedbackMapper;

    @Override
    public FeedbackDto save(FeedbackDto feedbackDto) {
        Submission submission = submissionRepo.findById(feedbackDto.getSubmission().getId())
                .orElseThrow(() -> new NotFoundException("Submission not found with id: " + feedbackDto.getSubmission().getId()));
        Feedback feedback = feedbackMapper.dtoToEntity(feedbackDto);
        feedback.setSubmission(submission);
        Feedback savedFeedback = feedbackRepo.save(feedback);
        return feedbackMapper.entityToDto(savedFeedback);
    }

    @Override
    public List<FeedbackDto> findAll() {
        List<Feedback> feedbackList = feedbackRepo.findAll();
        return feedbackList.stream().map(feedbackMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public FeedbackDto findById(Long id) {
        Feedback feedback = feedbackRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Feedback not found with id: " + id));
        return feedbackMapper.entityToDto(feedback);
    }

    @Override
    public FeedbackDto update(Long id, FeedbackDto feedbackDto) {
        Feedback feedback = feedbackRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Feedback not found with id: " + id));

        if (feedbackDto.getFeedbackText() != null) {
            feedback.setFeedbackText(feedbackDto.getFeedbackText());
        }
        if (feedbackDto.getSubmission() != null) {
            Submission submission = submissionRepo.findById(feedbackDto.getSubmission().getId())
                    .orElseThrow(() -> new NotFoundException("Submission not found with id: " + feedbackDto.getSubmission().getId()));
            feedback.setSubmission(submission);
        }
        if (feedbackDto.getFeedbackDate() != null) {
            feedback.setFeedbackDate(feedbackDto.getFeedbackDate());
        }

        Feedback updatedFeedback = feedbackRepo.save(feedback);
        return feedbackMapper.entityToDto(updatedFeedback);
    }

    @Override
    public void delete(Long id) {
        Feedback feedback = feedbackRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Feedback not found with id: " + id));
        feedbackRepo.delete(feedback);
    }

    @Override
    public List<FeedbackDto> findByText(String text) {
        List<Feedback> feedbackList = feedbackRepo.findByFeedbackTextContaining(text);
        return feedbackList.stream().map(feedbackMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FeedbackDto> findBySubmission(Long submissionId) {
        List<Feedback> feedbackList = feedbackRepo.findBySubmissionId(submissionId);
        return feedbackList.stream().map(feedbackMapper::entityToDto).collect(Collectors.toList());
    }
}
