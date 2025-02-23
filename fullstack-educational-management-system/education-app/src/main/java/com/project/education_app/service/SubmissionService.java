package com.project.education_app.service;

import com.project.education_app.dtos.SubmissionDto;

import java.util.List;

public interface SubmissionService {
    SubmissionDto save(SubmissionDto submissionDto);

    List<SubmissionDto> findAll();

    SubmissionDto findById(Long id);

    SubmissionDto update(Long id, SubmissionDto submissionDto);

    void delete(Long id);

    List<SubmissionDto> findByContent(String content);

    List<SubmissionDto> findByStudent(Long studentId);

    List<SubmissionDto> findByGrade(Long gradeId);

    List<SubmissionDto> findByFeedback(Long feedbackId);
}
