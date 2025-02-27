package com.project.education_app.controllers;

import com.project.education_app.dtos.LessonDto;
import com.project.education_app.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignments")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class LessonController {
    private final LessonService lessonService;

    // Create Lesson
    @PostMapping
    public LessonDto createLesson(@RequestBody LessonDto lessonDto) {
        return lessonService.save(lessonDto);
    }

    // Read All Lessons
    @GetMapping
    public List<LessonDto> getAllLessons() {
        return lessonService.findAll();
    }

    // Read Lesson by ID
    @GetMapping("/{id}")
    public LessonDto getLessonById(@PathVariable Long id) {
        return lessonService.findById(id);
    }

    // Update Lesson (using PATCH)
    @PatchMapping("/{id}")
    public LessonDto updateLesson(@PathVariable Long id, @RequestBody LessonDto lessonDto) {
        return lessonService.update(id, lessonDto);
    }

    // Delete Lesson
    @DeleteMapping("/{id}")
    public void deleteLesson(@PathVariable Long id) {
        lessonService.delete(id);
    }

    // Find Lessons by Title
    @GetMapping("/title/{title}")
    public List<LessonDto> findByTitle(@PathVariable String title) {
        return lessonService.findByTitle(title);
    }

    // Find Lessons by Content
    @GetMapping("/content/{content}")
    public List<LessonDto> findByContent(@PathVariable String content) {
        return lessonService.findByContent(content);
    }

    // Find Lessons by Author
    @GetMapping("/author/{authorId}")
    public List<LessonDto> findByAuthor(@PathVariable Long authorId) {
        return lessonService.findByAuthor(authorId);
    }
}
