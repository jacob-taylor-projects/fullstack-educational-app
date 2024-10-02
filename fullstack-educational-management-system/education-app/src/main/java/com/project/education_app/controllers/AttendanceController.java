package com.project.education_app.controllers;

import com.project.education_app.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendances")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AttendanceController {
    private final AttendanceService attendanceService;
}
