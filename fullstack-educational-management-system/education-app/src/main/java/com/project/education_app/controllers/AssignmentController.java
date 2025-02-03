package com.project.education_app.controllers;

import com.project.education_app.dtos.AssignmentDto;
import com.project.education_app.service.AssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/assignments")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AssignmentController {
    private final AssignmentService assignmentService;

    @PostMapping
    public AssignmentDto createAssignment(@RequestBody AssignmentDto assignmentDto) {
        return assignmentService.createAssignment(assignmentDto);
    }

    @GetMapping
    public List<AssignmentDto> getAllAssignments() {
        return assignmentService.findAll();
    }

    @GetMapping("/{id}")
    public AssignmentDto getAssignmentById(@PathVariable Long id) {
        return assignmentService.findById(id);
    }

    @PatchMapping("/{id}")
    public AssignmentDto updateAssignment(@PathVariable Long id, @RequestBody AssignmentDto assignmentDto) {
        return assignmentService.updateAssignment(id, assignmentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAssignment(@PathVariable Long id) {
        assignmentService.deleteAssignment(id);
    }

    @GetMapping("/title/{title}")
    public List<AssignmentDto> findByTitle(@PathVariable String title) {
        return assignmentService.findByTitle(title);
    }

    @GetMapping("/teacher/{teacherId}")
    public List<AssignmentDto> findByTeacher(@PathVariable Long teacherId) {
        return assignmentService.findByTeacher(teacherId);
    }

    @GetMapping("/due/{dueDate}")
    public List<AssignmentDto> findByDueDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dueDate) {
        return assignmentService.findByDueDate(dueDate);
    }

    @GetMapping("/completed/{completed}")
    public List<AssignmentDto> findByCompleted(@PathVariable boolean completed) {
        return assignmentService.findByCompleted(completed);
    }

    @PatchMapping("/{id}/complete")
    public AssignmentDto markComplete(@PathVariable Long id) {
        return assignmentService.markComplete(id);
    }

    @PostMapping("/{id}/students")
    public AssignmentDto assignStudentsToAssignment(@PathVariable Long id, @RequestBody List<Long> studentIds) {
        return assignmentService.assignStudents(id, studentIds);
    }

    @PostMapping("/{id}/problemAnswers")
    public AssignmentDto assignProblemAnswersToAssignment(@PathVariable Long id, @RequestBody List<Long> problemAnswerIds) {
        return assignmentService.assignProblemAnswers(id, problemAnswerIds);
    }
}
