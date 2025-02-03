package com.project.education_app.controllers;

import com.project.education_app.dtos.CommentDto;
import com.project.education_app.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CommentController {
    private final CommentService commentService;

    @PostMapping
    public CommentDto createComment(@RequestBody CommentDto commentDto) {
        return commentService.createComment(commentDto);
    }

    @GetMapping
    public List<CommentDto> getAllComments() {
        return commentService.findAll();
    }

    @GetMapping("/{id}")
    public CommentDto getCommentById(@PathVariable Long id) {
        return commentService.findById(id);
    }

    @PatchMapping("/{id}")
    public CommentDto updateComment(@PathVariable Long id, @RequestBody CommentDto commentDto) {
        return commentService.update(id, commentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.delete(id);
    }

    @GetMapping("/post/{postId}")
    public List<CommentDto> findByPost(@PathVariable Long postId) {
        return commentService.findByPost(postId);
    }

    @GetMapping("/student/{studentId}")
    public List<CommentDto> findByStudent(@PathVariable Long studentId) {
        return commentService.findByStudent(studentId);
    }

    @GetMapping("/post/{postId}/student/{studentId}")
    public List<CommentDto> findByPostAndStudent(@PathVariable Long postId, @PathVariable Long studentId) {
        return commentService.findByPostAndStudent(postId, studentId);
    }
}
