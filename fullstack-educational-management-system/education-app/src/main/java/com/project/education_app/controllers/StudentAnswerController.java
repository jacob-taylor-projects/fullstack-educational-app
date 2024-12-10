package com.project.education_app.controllers;

import com.project.education_app.service.ProblemAnswerService;
import com.project.education_app.service.StudentAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-answers")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class StudentAnswerController {
    private final StudentAnswerService studentAnswerService;
}
