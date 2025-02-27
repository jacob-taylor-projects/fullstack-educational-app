package com.project.education_app.controllers;

import com.project.education_app.dtos.SemesterDto;
import com.project.education_app.service.SemesterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semesters")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SemesterController {
    private final SemesterService semesterService;

    // Create Semester
    @PostMapping
    public SemesterDto createSemester(@RequestBody SemesterDto semesterDto) {
        return semesterService.save(semesterDto);
    }

    // Read All Semesters
    @GetMapping
    public List<SemesterDto> getAllSemesters() {
        return semesterService.findAll();
    }

    // Read Semester by ID
    @GetMapping("/{id}")
    public SemesterDto getSemesterById(@PathVariable Long id) {
        return semesterService.findById(id);
    }

    // Update Semester (using PATCH)
    @PatchMapping("/{id}")
    public SemesterDto updateSemester(@PathVariable Long id, @RequestBody SemesterDto semesterDto) {
        return semesterService.update(id, semesterDto);
    }

    // Delete Semester
    @DeleteMapping("/{id}")
    public void deleteSemester(@PathVariable Long id) {
        semesterService.delete(id);
    }

    // Find Semesters by Name
    @GetMapping("/name/{name}")
    public List<SemesterDto> findByName(@PathVariable String name) {
        return semesterService.findByName(name);
    }

    // Find Semesters by Year
    @GetMapping("/year/{year}")
    public List<SemesterDto> findByYear(@PathVariable String year) {
        return semesterService.findByYear(year);
    }

    // Find Semesters by Schedules
    @GetMapping("/schedules/{scheduleId}")
    public List<SemesterDto> findBySchedulesId(@PathVariable Long scheduleId) {
        return semesterService.findBySchedulesId(scheduleId);
    }

    // Find Semesters by Courses
    @GetMapping("/courses/{courseId}")
    public List<SemesterDto> findByCoursesId(@PathVariable Long courseId) {
        return semesterService.findByCoursesId(courseId);
    }

    // Assign Schedules to Semester
    @PostMapping("/{id}/schedules")
    public SemesterDto assignSchedulesToSemester(@PathVariable Long id, @RequestBody List<Long> scheduleIds) {
        return semesterService.assignSchedules(id, scheduleIds);
    }

    // Assign Courses to Semester
    @PostMapping("/{id}/courses")
    public SemesterDto assignCoursesToSemester(@PathVariable Long id, @RequestBody List<Long> courseIds) {
        return semesterService.assignCourses(id, courseIds);
    }
}
