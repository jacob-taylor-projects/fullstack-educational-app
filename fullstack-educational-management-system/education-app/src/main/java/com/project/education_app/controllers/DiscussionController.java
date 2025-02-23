package com.project.education_app.controllers;

import com.project.education_app.dtos.DiscussionDto;
import com.project.education_app.dtos.FullFacultyDto;
import com.project.education_app.service.DiscussionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discussions")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DiscussionController {
    private final DiscussionService discussionService;

    @PostMapping
    public DiscussionDto createDiscussion(@RequestBody DiscussionDto discussionDto) {
        return discussionService.save(discussionDto);
    }

    @GetMapping
    public List<DiscussionDto> getAllDiscussions() {
        return discussionService.findAll();
    }

    @GetMapping("/{id}")
    public DiscussionDto getDiscussionById(@PathVariable Long id) {
        return discussionService.findById(id);
    }

    @PatchMapping("/{id}")
    public DiscussionDto updateDiscussion(@PathVariable Long id, @RequestBody DiscussionDto discussionDto) {
        return discussionService.update(id, discussionDto);
    }

    @DeleteMapping("/{id}")
    public void deleteDiscussion(@PathVariable Long id) {
        discussionService.delete(id);
    }

    @GetMapping("/title/{title}")
    public List<DiscussionDto> findByTitle(@PathVariable String title) {
        return discussionService.findByTitle(title);
    }

    @GetMapping("/description/{description}")
    public List<DiscussionDto> findByDescription(@PathVariable String description) {
        return discussionService.findByDescription(description);
    }

    @GetMapping("/teacher/{teacherId}")
    public List<DiscussionDto> findByTeacher(@PathVariable Long teacherId) {
        return discussionService.findByTeacher(teacherId);
    }

    @PostMapping("/{id}/posts")
    public DiscussionDto assignPostsToDiscussion(@PathVariable Long id, @RequestBody List<Long> postIds) {
        return discussionService.assignPosts(id, postIds);
    }


}
