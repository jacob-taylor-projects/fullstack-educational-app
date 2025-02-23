package com.project.education_app.controllers;

import com.project.education_app.dtos.FeedbackDto;
import com.project.education_app.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class FeedbackController {
    private final FeedbackService feedbackService;

    // Create Feedback
    @PostMapping
    public FeedbackDto createFeedback(@RequestBody FeedbackDto feedbackDto) {
        return feedbackService.save(feedbackDto);
    }

    // Read All Feedback
    @GetMapping
    public List<FeedbackDto> getAllFeedback() {
        return feedbackService.findAll();
    }

    // Read Feedback by ID
    @GetMapping("/{id}")
    public FeedbackDto getFeedbackById(@PathVariable Long id) {
        return feedbackService.findById(id);
    }

    // Update Feedback (using PATCH)
    @PatchMapping("/{id}")
    public FeedbackDto updateFeedback(@PathVariable Long id, @RequestBody FeedbackDto feedbackDto) {
        return feedbackService.update(id, feedbackDto);
    }

    // Delete Feedback
    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable Long id) {
        feedbackService.delete(id);
    }

    // Find Feedback by Text
    @GetMapping("/text/{text}")
    public List<FeedbackDto> findByText(@PathVariable String text) {
        return feedbackService.findByText(text);
    }

    // Find Feedback by Submission
    @GetMapping("/submission/{submissionId}")
    public List<FeedbackDto> findBySubmission(@PathVariable Long submissionId) {
        return feedbackService.findBySubmission(submissionId);
    }
}
