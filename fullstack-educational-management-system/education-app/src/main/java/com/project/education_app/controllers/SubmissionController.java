package com.project.education_app.controllers;

import com.project.education_app.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/submissions")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SubmissionController {
    private final SubmissionService submissionService;
}
