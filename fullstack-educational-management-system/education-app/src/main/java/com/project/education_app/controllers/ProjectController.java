package com.project.education_app.controllers;

import com.project.education_app.dtos.AssignmentDto;
import com.project.education_app.dtos.ProjectDto;
import com.project.education_app.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping
    public ProjectDto createProject(@RequestBody ProjectDto projectDto) {
        return projectService.createProject(projectDto);
    }

    @GetMapping
    public List<ProjectDto> getAllProjects() {
        return projectService.findAll();
    }

    @GetMapping("/{id}")
    public ProjectDto getProjectById(@PathVariable Long id) {
        return projectService.findById(id);
    }

    @PatchMapping("/{id}")
    public ProjectDto updateProject(@PathVariable Long id, @RequestBody ProjectDto projectDto) {
        return projectService.updateProject(id, projectDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }

    @GetMapping("/title/{title}")
    public List<ProjectDto> findByTitle(@PathVariable String title) {
        return projectService.findByTitle(title);
    }

    @GetMapping("/teacher/{teacherId}")
    public List<ProjectDto> findByTeacher(@PathVariable Long teacherId) {
        return projectService.findByTeacher(teacherId);
    }

    @GetMapping("/due/{dueDate}")
    public List<ProjectDto> findByDueDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dueDate) {
        return projectService.findByDueDate(dueDate);
    }

    @GetMapping("/completed/{completed}")
    public List<ProjectDto> findByCompleted(@PathVariable boolean completed) {
        return projectService.findByCompleted(completed);
    }

    @PatchMapping("/{id}/complete")
    public ProjectDto markComplete(@PathVariable Long id) {
        return projectService.markComplete(id);
    }

    @PostMapping("/{id}/students")
    public ProjectDto assignStudentsToProject(@PathVariable Long id, @RequestBody List<Long> studentIds) {
        return projectService.assignStudents(id, studentIds);
    }

    @PostMapping("/{id}/problemAnswers")
    public ProjectDto assignProblemAnswersToProject(@PathVariable Long id, @RequestBody Long problemAnswerIds) {
        return projectService.assignProblemAnswers(id, problemAnswerIds);
    }
}
