package com.project.education_app.controllers;

import com.project.education_app.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TestController {
    private final TestService testService;
}