package com.project.education_app.controllers;

import com.project.education_app.dtos.AttendanceDto;
import com.project.education_app.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/attendances")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AttendanceController {
    private final AttendanceService attendanceService;

    @PostMapping
    public AttendanceDto createAttendance(@RequestBody AttendanceDto attendanceDto) {
        return attendanceService.createAttendance(attendanceDto);
    }

    @PatchMapping("/{id}")
    public AttendanceDto updateAttendance(@PathVariable Long id, @RequestBody AttendanceDto attendanceDto) {
        return attendanceService.updateAttendance(id, attendanceDto);
    }

    @GetMapping("/{id}")
    public AttendanceDto getAttendance(@PathVariable Long id) {
        return attendanceService.getAttendanceById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendance(@PathVariable Long id) {
        attendanceService.deleteAttendance(id);
    }

    @GetMapping("/student/{studentId}")
    public List<AttendanceDto> getAttendancesByStudent(@PathVariable Long studentId) {
        return attendanceService.findAttendancesByStudent(studentId);
    }

    @GetMapping("/course/{courseId}")
    public List<AttendanceDto> getAttendancesByCourse(@PathVariable Long courseId) {
        return attendanceService.findAttendancesByCourse(courseId);
    }

    @GetMapping("/date/{date}")
    public List<AttendanceDto> getAttendancesByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return attendanceService.findAttendancesByDate(date);
    }

    @GetMapping
    public List<AttendanceDto> getAllAttendances() {
        return attendanceService.getAllAttendances();
    }
}
