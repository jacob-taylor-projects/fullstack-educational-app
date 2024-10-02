package com.project.education_app.controllers;

import com.project.education_app.service.DiscussionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discussions")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DiscussionController {
    private final DiscussionService discussionService;
}
