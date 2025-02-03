package com.project.education_app.service.impl;

import com.project.education_app.dtos.CommentDto;
import com.project.education_app.entities.Comment;
import com.project.education_app.entities.Post;
import com.project.education_app.entities.Student;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.BasicStudentMapper;
import com.project.education_app.mappers.CommentMapper;
import com.project.education_app.mappers.PostMapper;
import com.project.education_app.repos.CommentRepo;
import com.project.education_app.repos.PostRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepo commentRepo;
    private final PostRepo postRepo;
    private final StudentRepo studentRepo;
    private final CommentMapper commentMapper;
    private final BasicStudentMapper basicStudentMapper;
    private final PostMapper postMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto) {
        Post post = postRepo.findById(commentDto.getPost().getId())
                .orElseThrow(() -> new NotFoundException("Post not found with id:" + commentDto.getPost().getId()));
        Student student = studentRepo.findById(commentDto.getStudent().getId())
                .orElseThrow(() -> new NotFoundException("Student not founde with id:" + commentDto.getStudent().getId()));
        Comment comment = commentMapper.dtoToEntity(commentDto);
        comment.setPost(post);
        comment.setStudent(student);
        Comment savedComment = commentRepo.save(comment);
        CommentDto savedCommentDto = commentMapper.entityToDto(savedComment);
        savedCommentDto.setPost(postMapper.entityToDto(savedComment.getPost()));
        savedCommentDto.setStudent(basicStudentMapper.entityToDto(savedComment.getStudent()));
        return savedCommentDto;
    }

    @Override
    public List<CommentDto> findAll() {
        List<Comment> comments = commentRepo.findAll();
        return comments.stream().map(commentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public CommentDto findById(Long id) {
        Comment comment = commentRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Comment not found with id:" + id));
        return commentMapper.entityToDto(comment);
    }

    @Override
    public CommentDto update(Long id, CommentDto commentDto) {
        Comment comment = commentRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Comment not found with id " + id));
        if (commentDto.getContent() != null) {
            comment.setContent(commentDto.getContent());
        }
        if (commentDto.getPost() != null) {
            Post post = postRepo.findById(commentDto.getPost().getId())
                    .orElseThrow(() -> new NotFoundException("Post not found with id" + commentDto.getPost().getId()));
            comment.setPost(post);
        }
        if (commentDto.getStudent() != null) {
            Student student = studentRepo.findById(commentDto.getStudent().getId())
                    .orElseThrow(() -> new NotFoundException("Student not found with id " + commentDto.getStudent().getId()));
            comment.setStudent(student);
        }
        Comment updatedComment = commentRepo.save(comment);
        CommentDto updatedCommentDto = commentMapper.entityToDto(updatedComment);
        updatedCommentDto.setPost(postMapper.entityToDto(updatedComment.getPost()));
        updatedCommentDto.setStudent(basicStudentMapper.entityToDto(updatedComment.getStudent()));
        return updatedCommentDto;
    }

    @Override
    public void delete(Long id) {
        Comment comment = commentRepo.findById(id).orElseThrow(() -> new NotFoundException("Comment not found with id" + id));
        commentRepo.delete(comment);
    }

    @Override
    public List<CommentDto> findByPost(Long postId) {
        List<Comment> comments = commentRepo.findByPostId(postId);
        return comments.stream().map(commentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<CommentDto> findByStudent(Long studentId) {
        List<Comment> comments = commentRepo.findByStudentId(studentId);
        return comments.stream().map(commentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<CommentDto> findByPostAndStudent(Long postId, Long studentId) {
        List<Comment> comments = commentRepo.findByPostIdAndStudentId(postId, studentId);
        return comments.stream().map(commentMapper::entityToDto).collect(Collectors.toList());
    }
}
