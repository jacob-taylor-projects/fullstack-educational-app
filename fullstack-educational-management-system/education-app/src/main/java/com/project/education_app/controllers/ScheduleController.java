package com.project.education_app.controllers;

import com.project.education_app.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ScheduleController {
    private final ScheduleService scheduleService;
}
