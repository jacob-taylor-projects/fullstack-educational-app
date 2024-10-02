package com.project.education_app.controllers;

import com.project.education_app.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ResourceController {
    private final ResourceService resourceService;
}
