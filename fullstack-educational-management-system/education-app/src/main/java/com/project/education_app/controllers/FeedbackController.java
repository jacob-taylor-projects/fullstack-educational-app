package com.project.education_app.controllers;

import com.project.education_app.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedbacks")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class FeedbackController {
    private final FeedbackService feedbackService;
}
