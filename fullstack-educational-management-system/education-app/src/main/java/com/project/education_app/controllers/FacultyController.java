package com.project.education_app.controllers;

import com.project.education_app.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faculties")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class FacultyController {
    private final FacultyService facultyService;
}
