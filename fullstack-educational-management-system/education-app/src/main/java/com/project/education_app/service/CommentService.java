package com.project.education_app.service;

import com.project.education_app.dtos.CommentDto;
import com.project.education_app.entities.Comment;

import java.util.List;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto);

    List<CommentDto> findAll();

    CommentDto findById(Long id);

    CommentDto update(Long id, CommentDto commentDto);

    void delete(Long id);

    List<CommentDto> findByPost(Long postId);

    List<CommentDto> findByStudent(Long studentId);

    List<CommentDto> findByPostAndStudent(Long postId, Long studentId);
}
