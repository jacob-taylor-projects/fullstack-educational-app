package com.project.education_app.controllers;

import com.project.education_app.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CommentController {
    private final CommentService commentService;
}
