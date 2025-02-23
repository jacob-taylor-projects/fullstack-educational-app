package com.project.education_app.service;

import com.project.education_app.dtos.DiscussionDto;

import java.util.List;

public interface DiscussionService {
    DiscussionDto save(DiscussionDto discussionDto);

    List<DiscussionDto> findAll();

    DiscussionDto findById(Long id);

    DiscussionDto update(Long id, DiscussionDto discussionDto);

    void delete(Long id);

    List<DiscussionDto> findByTitle(String title);

    List<DiscussionDto> findByDescription(String description);

    List<DiscussionDto> findByTeacher(Long teacherId);

    DiscussionDto assignPosts(Long id, List<Long> postIds);
}
