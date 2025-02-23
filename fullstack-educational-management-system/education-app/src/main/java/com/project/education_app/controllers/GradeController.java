package com.project.education_app.controllers;

import com.project.education_app.dtos.GradeDto;
import com.project.education_app.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class GradeController {
    private final GradeService gradeService;


    @PostMapping
    public GradeDto createGrade(@RequestBody GradeDto gradeDto) {
        return gradeService.save(gradeDto);
    }

    // Read All Grades
    @GetMapping
    public List<GradeDto> getAllGrades() {
        return gradeService.findAll();
    }

    // Read Grade by ID
    @GetMapping("/{id}")
    public GradeDto getGradeById(@PathVariable Long id) {
        return gradeService.findById(id);
    }

    // Update Grade (using PATCH)
    @PatchMapping("/{id}")
    public GradeDto updateGrade(@PathVariable Long id, @RequestBody GradeDto gradeDto) {
        return gradeService.update(id, gradeDto);
    }

    // Delete Grade
    @DeleteMapping("/{id}")
    public void deleteGrade(@PathVariable Long id) {
        gradeService.delete(id);
    }

    // Find Grades by Grade
    @GetMapping("/grade/{grade}")
    public List<GradeDto> findByGrade(@PathVariable double grade) {
        return gradeService.findByGrade(grade);
    }

    // Find Grades by Grade Greater Than
    @GetMapping("/gradeGreaterThan/{grade}")
    public List<GradeDto> findByGradeGreaterThan(@PathVariable double grade) {
        return gradeService.findByGradeGreaterThan(grade);
    }

    // Find Grades by Student
    @GetMapping("/student/{studentId}")
    public List<GradeDto> findByStudent(@PathVariable Long studentId) {
        return gradeService.findByStudent(studentId);
    }

    // Find Grades by Teacher
    @GetMapping("/teacher/{teacherId}")
    public List<GradeDto> findByTeacher(@PathVariable Long teacherId) {
        return gradeService.findByTeacher(teacherId);
    }

    // Find Grades by Course
    @GetMapping("/course/{courseId}")
    public List<GradeDto> findByCourse(@PathVariable Long courseId) {
        return gradeService.findByCourse(courseId);
    }

    // Find Grades by Submission
    @GetMapping("/submission/{submissionId}")
    public List<GradeDto> findBySubmission(@PathVariable Long submissionId) {
        return gradeService.findBySubmission(submissionId);
    }

    // Find Grades by CourseGrade
    @GetMapping("/courseGrade/{courseGradeId}")
    public List<GradeDto> findByCourseGrade(@PathVariable Long courseGradeId) {
        return gradeService.findByCourseGrade(courseGradeId);
    }
}
