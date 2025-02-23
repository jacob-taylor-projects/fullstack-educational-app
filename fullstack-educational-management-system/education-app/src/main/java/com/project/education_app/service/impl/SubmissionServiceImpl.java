package com.project.education_app.service.impl;

import com.project.education_app.dtos.SubmissionDto;
import com.project.education_app.entities.Feedback;
import com.project.education_app.entities.Grade;
import com.project.education_app.entities.Student;
import com.project.education_app.entities.Submission;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.SubmissionMapper;
import com.project.education_app.repos.FeedbackRepo;
import com.project.education_app.repos.GradeRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.repos.SubmissionRepo;
import com.project.education_app.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubmissionServiceImpl implements SubmissionService {

    private final SubmissionRepo submissionRepo;
    private final StudentRepo studentRepo;
    private final GradeRepo gradeRepo;
    private final FeedbackRepo feedbackRepo;
    private final SubmissionMapper submissionMapper;

    @Override

    public SubmissionDto save(SubmissionDto submissionDto) {
        Student student = studentRepo.findById(submissionDto.getStudent().getId())
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + submissionDto.getStudent().getId()));
        Grade grade = gradeRepo.findById(submissionDto.getGrade().getId())
                .orElseThrow(() -> new NotFoundException("Grade not found with id: " + submissionDto.getGrade().getId()));
        Feedback feedback = feedbackRepo.findById(submissionDto.getFeedback().getId())
                .orElseThrow(() -> new NotFoundException("Feedback not found with id: " + submissionDto.getFeedback().getId()));

        Submission submission = submissionMapper.dtoToEntity(submissionDto);
        submission.setStudent(student);
        submission.setGrade(grade);
        submission.setFeedback(feedback);

        Submission savedSubmission = submissionRepo.save(submission);
        return submissionMapper.entityToDto(savedSubmission);
    }

    @Override
    public List<SubmissionDto> findAll() {
        List<Submission> submissions = submissionRepo.findAll();
        return submissions.stream().map(submissionMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public SubmissionDto findById(Long id) {
        Submission submission = submissionRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Submission not found with id: " + id));
        return submissionMapper.entityToDto(submission);
    }

    @Override
    public SubmissionDto update(Long id, SubmissionDto submissionDto) {
        Submission submission = submissionRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Submission not found with id: " + id));

        if (submissionDto.getContent() != null) {
            submission.setContent(submissionDto.getContent());
        }
        if (submissionDto.getStudentAnswers() != null) {
            submission.setStudentAnswers(submissionMapper.dtoToEntity(submissionDto).getStudentAnswers());
        }
        if (submissionDto.getGrade() != null) {
            Grade grade = gradeRepo.findById(submissionDto.getGrade().getId())
                    .orElseThrow(() -> new NotFoundException("Grade not found with id: " + submissionDto.getGrade().getId()));
            submission.setGrade(grade);
        }
        if (submissionDto.getStudent() != null) {
            Student student = studentRepo.findById(submissionDto.getStudent().getId())
                    .orElseThrow(() -> new NotFoundException("Student not found with id: " + submissionDto.getStudent().getId()));
            submission.setStudent(student);
        }
        if (submissionDto.getFeedback() != null) {
            Feedback feedback = feedbackRepo.findById(submissionDto.getFeedback().getId())
                    .orElseThrow(() -> new NotFoundException("Feedback not found with id: " + submissionDto.getFeedback().getId()));
            submission.setFeedback(feedback);
        }
        if (submissionDto.getSubmissionDate() != null) {
            submission.setSubmissionDate(submissionDto.getSubmissionDate());
        }

        Submission updatedSubmission = submissionRepo.save(submission);
        return submissionMapper.entityToDto(updatedSubmission);
    }

    @Override
    public void delete(Long id) {
        Submission submission = submissionRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Submission not found with id: " + id));
        submissionRepo.delete(submission);
    }

    @Override
    public List<SubmissionDto> findByContent(String content) {
        List<Submission> submissions = submissionRepo.findByContentContaining(content);
        return submissions.stream().map(submissionMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SubmissionDto> findByStudent(Long studentId) {
        List<Submission> submissions = submissionRepo.findByStudentId(studentId);
        return submissions.stream().map(submissionMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SubmissionDto> findByGrade(Long gradeId) {
        List<Submission> submissions = submissionRepo.findByGradeId(gradeId);
        return submissions.stream().map(submissionMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SubmissionDto> findByFeedback(Long feedbackId) {
        List<Submission> submissions = submissionRepo.findByFeedbackId(feedbackId);
        return submissions.stream().map(submissionMapper::entityToDto).collect(Collectors.toList());
    }
}
