package com.project.education_app.service;

import com.project.education_app.dtos.AssignmentDto;

import java.time.LocalDate;
import java.util.List;

public interface AssignmentService {
    AssignmentDto createAssignment(AssignmentDto assignmentDto);

    List<AssignmentDto> findAll();

    AssignmentDto findById(Long id);

    AssignmentDto updateAssignment(Long id, AssignmentDto assignmentDto);

    void deleteAssignment(Long id);

    List<AssignmentDto> findByTitle(String title);

    List<AssignmentDto> findByTeacher(Long teacherId);

    List<AssignmentDto> findByDueDate(LocalDate dueDate);

    List<AssignmentDto> findByCompleted(boolean completed);

    AssignmentDto markComplete(Long id);

    AssignmentDto assignStudents(Long id, List<Long> studentIds);

    AssignmentDto assignProblemAnswers(Long id, List<Long> problemAnswerIds);
}
