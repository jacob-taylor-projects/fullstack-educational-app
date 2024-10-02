package com.project.education_app.controllers;

import com.project.education_app.service.SemesterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semesters")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SemesterController {
    private final SemesterService semesterService;
}
