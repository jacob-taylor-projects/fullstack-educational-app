package com.project.education_app.controllers;

import com.project.education_app.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assignments")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class LessonController {
    private final LessonService lessonService;
}
