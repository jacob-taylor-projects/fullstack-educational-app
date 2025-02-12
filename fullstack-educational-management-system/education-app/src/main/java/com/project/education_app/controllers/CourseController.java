package com.project.education_app.controllers;

import com.project.education_app.dtos.CourseDto;
import com.project.education_app.dtos.FullCourseDto;
import com.project.education_app.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CourseController {
    private final CourseService courseService;

    @PostMapping
    public CourseDto createCourse(@RequestBody CourseDto courseDto) {
        return courseService.save(courseDto);
    }

    // Read All Courses
    @GetMapping
    public List<FullCourseDto> getAllCourses() {
        return courseService.findAll();
    }

    // Read Course by ID
    @GetMapping("/{id}")
    public FullCourseDto getCourseById(@PathVariable Long id) {
        return courseService.findById(id);
    }

    // Update Course (using PATCH)
    @PatchMapping("/{id}")
    public CourseDto updateCourse(@PathVariable Long id, @RequestBody CourseDto courseDto) {
        return courseService.update(id, courseDto);
    }

    // Delete Course
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.delete(id);
    }

    // Find Courses by Name
    @GetMapping("/name/{name}")
    public List<FullCourseDto> findByName(@PathVariable String name) {
        return courseService.findByName(name);
    }

    // Find Courses by Subject
    @GetMapping("/subject/{subject}")
    public List<FullCourseDto> findBySubject(@PathVariable String subject) {
        return courseService.findBySubject(subject);
    }

    // Find Courses by Syllabus
    @GetMapping("/syllabus/{syllabusId}")
    public List<FullCourseDto> findBySyllabus(@PathVariable Long syllabusId) {
        return courseService.findBySyllabus(syllabusId);
    }

    // Find Courses by Students
    @GetMapping("/students/{studentId}")
    public List<FullCourseDto> findByStudents(@PathVariable Long studentId) {
        return courseService.findByStudents(studentId);
    }

    // Find Courses by Grades
    @GetMapping("/grades/{gradeId}")
    public List<FullCourseDto> findByGrades(@PathVariable Long gradeId) {
        return courseService.findByGrades(gradeId);
    }

    // Find Courses by Course Grades
    @GetMapping("/courseGrades/{courseGradeId}")
    public List<FullCourseDto> findByCourseGrades(@PathVariable Long courseGradeId) {
        return courseService.findByCourseGrades(courseGradeId);
    }

    // Find Courses by Resources
    @GetMapping("/resources/{resourceId}")
    public List<FullCourseDto> findByResources(@PathVariable Long resourceId) {
        return courseService.findByResources(resourceId);
    }

    // Find Courses by Units
    @GetMapping("/units/{unitId}")
    public List<FullCourseDto> findByUnits(@PathVariable Long unitId) {
        return courseService.findByUnits(unitId);
    }

    // Find Courses by Schedules
    @GetMapping("/schedules/{scheduleId}")
    public List<FullCourseDto> findBySchedules(@PathVariable Long scheduleId) {
        return courseService.findBySchedules(scheduleId);
    }

    // Find Courses by Semesters
    @GetMapping("/semesters/{semesterId}")
    public List<FullCourseDto> findBySemesters(@PathVariable Long semesterId) {
        return courseService.findBySemesters(semesterId);
    }

    // Assign Units to Course
    @PostMapping("/{id}/units")
    public FullCourseDto assignUnitsToCourse(@PathVariable Long id, @RequestBody List<Long> unitIds) {
        return courseService.assignUnits(id, unitIds);
    }

    // Assign Students to Course
    @PostMapping("/{id}/students")
    public FullCourseDto assignStudentsToCourse(@PathVariable Long id, @RequestBody List<Long> studentIds) {
        return courseService.assignStudents(id, studentIds);
    }

    // Assign Grades to Course
    @PostMapping("/{id}/grades")
    public FullCourseDto assignGradesToCourse(@PathVariable Long id, @RequestBody List<Long> gradeIds) {
        return courseService.assignGrades(id, gradeIds);
    }

    // Assign Resources to Course
    @PostMapping("/{id}/resources")
    public FullCourseDto assignResourcesToCourse(@PathVariable Long id, @RequestBody List<Long> resourceIds) {
        return courseService.assignResources(id, resourceIds);
    }

    // Assign Schedules to Course
    @PostMapping("/{id}/schedules")
    public FullCourseDto assignSchedulesToCourse(@PathVariable Long id, @RequestBody List<Long> scheduleIds) {
        return courseService.assignSchedules(id, scheduleIds);
    }
}
