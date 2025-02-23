package com.project.education_app.controllers;

import com.project.education_app.dtos.SubmissionDto;
import com.project.education_app.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/submissions")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SubmissionController {
    private final SubmissionService submissionService;


    // Create Submission
    @PostMapping
    public SubmissionDto createSubmission(@RequestBody SubmissionDto submissionDto) {
        return submissionService.save(submissionDto);
    }

    // Read All Submissions
    @GetMapping
    public List<SubmissionDto> getAllSubmissions() {
        return submissionService.findAll();
    }

    // Read Submission by ID
    @GetMapping("/{id}")
    public SubmissionDto getSubmissionById(@PathVariable Long id) {
        return submissionService.findById(id);
    }

    // Update Submission (using PATCH)
    @PatchMapping("/{id}")
    public SubmissionDto updateSubmission(@PathVariable Long id, @RequestBody SubmissionDto submissionDto) {
        return submissionService.update(id, submissionDto);
    }

    // Delete Submission
    @DeleteMapping("/{id}")
    public void deleteSubmission(@PathVariable Long id) {
        submissionService.delete(id);
    }

    // Find Submissions by Content
    @GetMapping("/content/{content}")
    public List<SubmissionDto> findByContent(@PathVariable String content) {
        return submissionService.findByContent(content);
    }

    // Find Submissions by Student
    @GetMapping("/student/{studentId}")
    public List<SubmissionDto> findByStudent(@PathVariable Long studentId) {
        return submissionService.findByStudent(studentId);
    }

    // Find Submissions by Grade
    @GetMapping("/grade/{gradeId}")
    public List<SubmissionDto> findByGrade(@PathVariable Long gradeId) {
        return submissionService.findByGrade(gradeId);
    }

    // Find Submissions by Feedback
    @GetMapping("/feedback/{feedbackId}")
    public List<SubmissionDto> findByFeedback(@PathVariable Long feedbackId) {
        return submissionService.findByFeedback(feedbackId);
    }
}
