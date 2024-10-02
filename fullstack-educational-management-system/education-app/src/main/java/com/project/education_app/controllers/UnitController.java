package com.project.education_app.controllers;

import com.project.education_app.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/units")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UnitController {
    private final UnitService unitService;
}
