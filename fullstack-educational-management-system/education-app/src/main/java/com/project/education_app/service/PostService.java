package com.project.education_app.service;

import com.project.education_app.dtos.PostDto;

import java.util.List;

public interface PostService {
    PostDto save(PostDto postDto);

    List<PostDto> findAll();

    PostDto findById(Long id);

    PostDto update(Long id, PostDto postDto);

    void delete(Long id);

    List<PostDto> findByContent(String content);

    List<PostDto> findByDiscussion(Long discussionId);

    List<PostDto> findByStudent(Long studentId);

    List<PostDto> findByComments(Long commentId);

    PostDto assignComments(Long id, List<Long> commentIds);
}
