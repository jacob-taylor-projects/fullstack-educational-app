package com.project.education_app.service;

import com.project.education_app.dtos.AssignmentDto;
import com.project.education_app.dtos.ProjectDto;

import java.time.LocalDate;
import java.util.List;

public interface ProjectService {
    ProjectDto createProject(ProjectDto projectDto);

    List<ProjectDto> findAll();

    ProjectDto findById(Long id);

    ProjectDto updateProject(Long id, ProjectDto projectDto);

    void deleteProject(Long id);

    List<ProjectDto> findByTitle(String title);

    List<ProjectDto> findByTeacher(Long teacherId);

    List<ProjectDto> findByDueDate(LocalDate dueDate);

    List<ProjectDto> findByCompleted(boolean completed);

    ProjectDto markComplete(Long id);

    ProjectDto assignStudents(Long id, List<Long> studentIds);

    ProjectDto assignProblemAnswers(Long id, Long problemAnswerIds);

}
