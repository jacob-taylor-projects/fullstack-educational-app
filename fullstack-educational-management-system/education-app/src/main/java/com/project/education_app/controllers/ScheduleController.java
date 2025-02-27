package com.project.education_app.controllers;

import com.project.education_app.dtos.ScheduleDto;
import com.project.education_app.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ScheduleController {
    private final ScheduleService scheduleService;

    // Create Schedule
    @PostMapping
    public ScheduleDto createSchedule(@RequestBody ScheduleDto scheduleDto) {
        return scheduleService.save(scheduleDto);
    }

    // Read All Schedules
    @GetMapping
    public List<ScheduleDto> getAllSchedules() {
        return scheduleService.findAll();
    }

    // Read Schedule by ID
    @GetMapping("/{id}")
    public ScheduleDto getScheduleById(@PathVariable Long id) {
        return scheduleService.findById(id);
    }

    // Update Schedule (using PATCH)
    @PatchMapping("/{id}")
    public ScheduleDto updateSchedule(@PathVariable Long id, @RequestBody ScheduleDto scheduleDto) {
        return scheduleService.update(id, scheduleDto);
    }

    // Delete Schedule
    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Long id) {
        scheduleService.delete(id);
    }

    // Find Schedules by Name
    @GetMapping("/name/{name}")
    public List<ScheduleDto> findByName(@PathVariable String name) {
        return scheduleService.findByName(name);
    }

    // Find Schedules by Description
    @GetMapping("/description/{description}")
    public List<ScheduleDto> findByDescription(@PathVariable String description) {
        return scheduleService.findByDescription(description);
    }

    // Find Schedules by Student
    @GetMapping("/student/{studentId}")
    public List<ScheduleDto> findByStudent(@PathVariable Long studentId) {
        return scheduleService.findByStudent(studentId);
    }

    // Find Schedules by Courses
    @GetMapping("/courses/{courseId}")
    public List<ScheduleDto> findByCoursesId(@PathVariable Long courseId) {
        return scheduleService.findByCoursesId(courseId);
    }

    // Find Schedules by Semester
    @GetMapping("/semester/{semesterId}")
    public List<ScheduleDto> findBySemester(@PathVariable Long semesterId) {
        return scheduleService.findBySemester(semesterId);
    }

    // Assign Courses to Schedule
    @PostMapping("/{id}/courses")
    public ScheduleDto assignCoursesToSchedule(@PathVariable Long id, @RequestBody List<Long> courseIds) {
        return scheduleService.assignCourses(id, courseIds);
    }
}
