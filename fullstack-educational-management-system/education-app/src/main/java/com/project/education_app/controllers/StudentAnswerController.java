package com.project.education_app.controllers;

import com.project.education_app.dtos.StudentAnswerDto;
import com.project.education_app.service.ProblemAnswerService;
import com.project.education_app.service.StudentAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/student-answers")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class StudentAnswerController {
    private final StudentAnswerService studentAnswerService;

    // Create Student Answer
    @PostMapping
    public StudentAnswerDto createStudentAnswer(@RequestBody StudentAnswerDto studentAnswerDto) {
        return studentAnswerService.save(studentAnswerDto);
    }

    // Read All Student Answers
    @GetMapping
    public List<StudentAnswerDto> getAllStudentAnswers() {
        return studentAnswerService.findAll();
    }

    // Read Student Answer by ID
    @GetMapping("/{id}")
    public StudentAnswerDto getStudentAnswerById(@PathVariable Long id) {
        return studentAnswerService.findById(id);
    }

    // Update Student Answer (using PATCH)
    @PatchMapping("/{id}")
    public StudentAnswerDto updateStudentAnswer(@PathVariable Long id, @RequestBody StudentAnswerDto studentAnswerDto) {
        return studentAnswerService.update(id, studentAnswerDto);
    }

    // Delete Student Answer
    @DeleteMapping("/{id}")
    public void deleteStudentAnswer(@PathVariable Long id) {
        studentAnswerService.delete(id);
    }

    // Find Student Answers by Student
    @GetMapping("/student/{studentId}")
    public List<StudentAnswerDto> findByStudent(@PathVariable Long studentId) {
        return studentAnswerService.findByStudent(studentId);
    }

    // Find Student Answers by Problem Answer
    @GetMapping("/problem-answer/{problemAnswerId}")
    public List<StudentAnswerDto> findByProblemAnswer(@PathVariable Long problemAnswerId) {
        return studentAnswerService.findByProblemAnswer(problemAnswerId);
    }

    // Find Student Answers by Answer Content
    @GetMapping("/answer-content/{answerContent}")
    public List<StudentAnswerDto> findByAnswerContent(@PathVariable String answerContent) {
        return studentAnswerService.findByAnswerContent(answerContent);
    }

    // Find Student Answers by Submission Date
    @GetMapping("/submission-date/{submissionDate}")
    public List<StudentAnswerDto> findBySubmissionDate(@PathVariable Timestamp submissionDate) {
        return studentAnswerService.findBySubmissionDate(submissionDate);
    }
}
