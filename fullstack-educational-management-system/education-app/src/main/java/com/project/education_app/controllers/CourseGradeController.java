package com.project.education_app.controllers;

import com.project.education_app.dtos.CourseGradeDto;
import com.project.education_app.service.CourseGradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseGrades")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CourseGradeController {
    private final CourseGradeService courseGradeService;

    @PostMapping
    public CourseGradeDto createCourseGrade(@RequestBody CourseGradeDto courseGradeDto) {
        return courseGradeService.createCourseGrade(courseGradeDto);
    }

    @GetMapping
    public List<CourseGradeDto> getAllCourseGrades() {
        return courseGradeService.findAll();
    }

    @GetMapping("/{id}")
    public CourseGradeDto getCourseGradeById(@PathVariable Long id) {
        return courseGradeService.findById(id);
    }

    @PatchMapping("/{id}")
    public CourseGradeDto updateCourseGrade(@PathVariable Long id, @RequestBody CourseGradeDto courseGradeDto) {
        return courseGradeService.update(id, courseGradeDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseGrade(@PathVariable Long id) {
        courseGradeService.delete(id);
    }

    @GetMapping("/student/{studentId}")
    public List<CourseGradeDto> findByStudent(@PathVariable Long studentId) {
        return courseGradeService.findByStudent(studentId);
    }

    @GetMapping("/course/{courseId}")
    public List<CourseGradeDto> findByCourse(@PathVariable Long courseId) {
        return courseGradeService.findByCourse(courseId);
    }


    @GetMapping("/gradeGreaterThan/{grade}")
    public List<CourseGradeDto> findByGradeGreaterThan(@PathVariable double grade) {
        return courseGradeService.findByGradeGreaterThan(grade);
    }

    @PostMapping("{id}/grades")
    public CourseGradeDto assignGradesToCourseGrade(@PathVariable Long id, @RequestBody List<Long> gradeIds) {
        return courseGradeService.assignGrades(id, gradeIds);
    }
}
