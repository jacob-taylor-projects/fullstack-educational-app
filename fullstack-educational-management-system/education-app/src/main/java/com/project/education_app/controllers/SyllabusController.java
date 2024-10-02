package com.project.education_app.controllers;

import com.project.education_app.service.SyllabusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/syllabi")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SyllabusController {
    private final SyllabusService syllabusService;
}
