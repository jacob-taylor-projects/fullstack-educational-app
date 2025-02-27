package com.project.education_app.service;

import com.project.education_app.dtos.StudentAnswerDto;

import java.sql.Timestamp;
import java.util.List;

public interface StudentAnswerService {
    StudentAnswerDto save(StudentAnswerDto studentAnswerDto);

    List<StudentAnswerDto> findAll();

    StudentAnswerDto findById(Long id);

    StudentAnswerDto update(Long id, StudentAnswerDto studentAnswerDto);

    void delete(Long id);

    List<StudentAnswerDto> findByStudent(Long studentId);

    List<StudentAnswerDto> findByProblemAnswer(Long problemAnswerId);

    List<StudentAnswerDto> findByAnswerContent(String answerContent);

    List<StudentAnswerDto> findBySubmissionDate(Timestamp submissionDate);
}
