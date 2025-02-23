package com.project.education_app.controllers;

import com.project.education_app.dtos.SyllabusDto;
import com.project.education_app.service.SyllabusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/syllabi")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SyllabusController {
    private final SyllabusService syllabusService;


    // Create Syllabus
    @PostMapping
    public SyllabusDto createSyllabus(@RequestBody SyllabusDto syllabusDto) {
        return syllabusService.save(syllabusDto);
    }

    // Read All Syllabi
    @GetMapping
    public List<SyllabusDto> getAllSyllabi() {
        return syllabusService.findAll();
    }

    // Read Syllabus by ID
    @GetMapping("/{id}")
    public SyllabusDto getSyllabusById(@PathVariable Long id) {
        return syllabusService.findById(id);
    }

    // Update Syllabus (using PATCH)
    @PatchMapping("/{id}")
    public SyllabusDto updateSyllabus(@PathVariable Long id, @RequestBody SyllabusDto syllabusDto) {
        return syllabusService.update(id, syllabusDto);
    }

    // Delete Syllabus
    @DeleteMapping("/{id}")
    public void deleteSyllabus(@PathVariable Long id) {
        syllabusService.delete(id);
    }

    // Find Syllabus by Objectives
    @GetMapping("/objectives/{objectives}")
    public List<SyllabusDto> findByObjectives(@PathVariable String objectives) {
        return syllabusService.findByObjectives(objectives);
    }

    // Find Syllabus by Topics
    @GetMapping("/topics/{topics}")
    public List<SyllabusDto> findByTopics(@PathVariable String topics) {
        return syllabusService.findByTopics(topics);
    }

    // Find Syllabus by Evaluation Criteria
    @GetMapping("/evaluationCriteria/{criteria}")
    public List<SyllabusDto> findByEvaluationCriteria(@PathVariable String criteria) {
        return syllabusService.findByEvaluationCriteria(criteria);
    }

    // Find Syllabus by Course ID
    @GetMapping("/course/{courseId}")
    public List<SyllabusDto> findByCourseId(@PathVariable Long courseId) {
        return syllabusService.findByCourseId(courseId);
    }

    // Find Syllabus by Assignment ID
    @GetMapping("/assignments/{assignmentId}")
    public List<SyllabusDto> findByAssignmentsId(@PathVariable Long assignmentId) {
        return syllabusService.findByAssignmentsId(assignmentId);
    }

    // Find Syllabus by Project ID
    @GetMapping("/projects/{projectId}")
    public List<SyllabusDto> findByProjectsId(@PathVariable Long projectId) {
        return syllabusService.findByProjectsId(projectId);
    }

    // Find Syllabus by Test ID
    @GetMapping("/tests/{testId}")
    public List<SyllabusDto> findByTestsId(@PathVariable Long testId) {
        return syllabusService.findByTestsId(testId);
    }

    // Find Syllabus by Resource ID
    @GetMapping("/resources/{resourceId}")
    public List<SyllabusDto> findByResourcesId(@PathVariable Long resourceId) {
        return syllabusService.findByResourcesId(resourceId);
    }

    // Assign Assignments to Syllabus
    @PostMapping("/{id}/assignments")
    public SyllabusDto assignAssignmentsToSyllabus(@PathVariable Long id, @RequestBody List<Long> assignmentIds) {
        return syllabusService.assignAssignments(id, assignmentIds);
    }

    // Assign Projects to Syllabus
    @PostMapping("/{id}/projects")
    public SyllabusDto assignProjectsToSyllabus(@PathVariable Long id, @RequestBody List<Long> projectIds) {
        return syllabusService.assignProjects(id, projectIds);
    }

    // Assign Tests to Syllabus
    @PostMapping("/{id}/tests")
    public SyllabusDto assignTestsToSyllabus(@PathVariable Long id, @RequestBody List<Long> testIds) {
        return syllabusService.assignTests(id, testIds);
    }

    // Assign Resources to Syllabus
    @PostMapping("/{id}/resources")
    public SyllabusDto assignResourcesToSyllabus(@PathVariable Long id, @RequestBody List<Long> resourceIds) {
        return syllabusService.assignResources(id, resourceIds);
    }
}
