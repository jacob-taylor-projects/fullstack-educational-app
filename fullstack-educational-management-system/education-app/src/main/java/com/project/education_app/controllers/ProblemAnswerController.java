package com.project.education_app.controllers;

import com.project.education_app.service.ProblemAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/problem-answers")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProblemAnswerController {
    private final ProblemAnswerService problemAnswerService;
}
