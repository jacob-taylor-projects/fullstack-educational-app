package com.project.education_app.controllers;

import com.project.education_app.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grades")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class GradeController {
    private final GradeService gradeService;
}
