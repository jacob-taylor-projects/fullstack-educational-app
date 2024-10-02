package com.project.education_app.controllers;

import com.project.education_app.service.CourseGradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course-grades")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CourseGradeController {
    private final CourseGradeService courseGradeService;
}
