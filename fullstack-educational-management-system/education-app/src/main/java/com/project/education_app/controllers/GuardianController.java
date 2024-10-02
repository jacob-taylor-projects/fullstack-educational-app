package com.project.education_app.controllers;

import com.project.education_app.service.GuardianService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guardians")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class GuardianController {
    private final GuardianService guardianService;
}
