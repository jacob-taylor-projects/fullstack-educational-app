package com.project.education_app.service;


import com.project.education_app.dtos.TestDto;

import java.time.LocalDate;
import java.util.List;

public interface TestService {
    TestDto createTest(TestDto testDto);

    List<TestDto> findAll();

    TestDto findById(Long id);

    TestDto updateTest(Long id, TestDto testDto);

    void deleteTest(Long id);

    List<TestDto> findByTitle(String title);

    List<TestDto> findByTeacher(Long teacherId);

    List<TestDto> findByDueDate(LocalDate dueDate);

    List<TestDto> findByCompleted(boolean completed);

    TestDto markComplete(Long id);

    TestDto assignStudents(Long id, List<Long> studentIds);

    TestDto assignProblemAnswers(Long id, List<Long> problemAnswerIds);
}
