package com.project.education_app.controllers;

import com.project.education_app.dtos.PostDto;
import com.project.education_app.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PostController {
    private final PostService postService;

    // Create Post
    @PostMapping
    public PostDto createPost(@RequestBody PostDto postDto) {
        return postService.save(postDto);
    }

    // Read All Posts
    @GetMapping
    public List<PostDto> getAllPosts() {
        return postService.findAll();
    }

    // Read Post by ID
    @GetMapping("/{id}")
    public PostDto getPostById(@PathVariable Long id) {
        return postService.findById(id);
    }

    // Update Post (using PATCH)
    @PatchMapping("/{id}")
    public PostDto updatePost(@PathVariable Long id, @RequestBody PostDto postDto) {
        return postService.update(id, postDto);
    }

    // Delete Post
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.delete(id);
    }

    // Find Posts by Content
    @GetMapping("/content/{content}")
    public List<PostDto> findByContent(@PathVariable String content) {
        return postService.findByContent(content);
    }

    // Find Posts by Discussion
    @GetMapping("/discussion/{discussionId}")
    public List<PostDto> findByDiscussion(@PathVariable Long discussionId) {
        return postService.findByDiscussion(discussionId);
    }

    // Find Posts by Student
    @GetMapping("/student/{studentId}")
    public List<PostDto> findByStudent(@PathVariable Long studentId) {
        return postService.findByStudent(studentId);
    }

    // Find Posts by Comments
    @GetMapping("/comments/{commentId}")
    public List<PostDto> findByComments(@PathVariable Long commentId) {
        return postService.findByComments(commentId);
    }

    // Assign Comments to Post
    @PostMapping("/{id}/comments")
    public PostDto assignCommentsToPost(@PathVariable Long id, @RequestBody List<Long> commentIds) {
        return postService.assignComments(id, commentIds);
    }
}
