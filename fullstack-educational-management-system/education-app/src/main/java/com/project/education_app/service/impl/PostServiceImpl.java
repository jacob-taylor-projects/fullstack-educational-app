package com.project.education_app.service.impl;

import com.project.education_app.dtos.PostDto;
import com.project.education_app.entities.Comment;
import com.project.education_app.entities.Discussion;
import com.project.education_app.entities.Post;
import com.project.education_app.entities.Student;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.PostMapper;
import com.project.education_app.repos.CommentRepo;
import com.project.education_app.repos.DiscussionRepo;
import com.project.education_app.repos.PostRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepo postRepo;
    private final StudentRepo studentRepo;
    private final DiscussionRepo discussionRepo;
    private final CommentRepo commentRepo;
    private final PostMapper postMapper;

    @Override
    public PostDto save(PostDto postDto) {
        Discussion discussion = discussionRepo.findById(postDto.getDiscussion().getId())
                .orElseThrow(() -> new NotFoundException("Discussion not found with id: " + postDto.getDiscussion().getId()));
        Student student = studentRepo.findById(postDto.getStudent().getId())
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + postDto.getStudent().getId()));
        Post post = postMapper.dtoToEntity(postDto);
        post.setDiscussion(discussion);
        post.setStudent(student);
        Post savedPost = postRepo.save(post);
        return postMapper.entityToDto(savedPost);
    }

    @Override
    public List<PostDto> findAll() {
        List<Post> posts = postRepo.findAll();
        return posts.stream().map(postMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public PostDto findById(Long id) {
        Post post = postRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Post not found with id: " + id));
        return postMapper.entityToDto(post);
    }

    @Override
    public PostDto update(Long id, PostDto postDto) {
        Post post = postRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Post not found with id: " + id));

        if (postDto.getContent() != null) {
            post.setContent(postDto.getContent());
        }
        if (postDto.getDiscussion() != null) {
            Discussion discussion = discussionRepo.findById(postDto.getDiscussion().getId())
                    .orElseThrow(() -> new NotFoundException("Discussion not found with id: " + postDto.getDiscussion().getId()));
            post.setDiscussion(discussion);
        }
        if (postDto.getStudent() != null) {
            Student student = studentRepo.findById(postDto.getStudent().getId())
                    .orElseThrow(() -> new NotFoundException("Student not found with id: " + postDto.getStudent().getId()));
            post.setStudent(student);
        }

        Post updatedPost = postRepo.save(post);
        return postMapper.entityToDto(updatedPost);
    }

    @Override
    public void delete(Long id) {
        Post post = postRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Post not found with id: " + id));
        postRepo.delete(post);
    }

    @Override
    public List<PostDto> findByContent(String content) {
        List<Post> posts = postRepo.findByContentContaining(content);
        return posts.stream().map(postMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<PostDto> findByDiscussion(Long discussionId) {
        List<Post> posts = postRepo.findByDiscussionId(discussionId);
        return posts.stream().map(postMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<PostDto> findByStudent(Long studentId) {
        List<Post> posts = postRepo.findByStudentId(studentId);
        return posts.stream().map(postMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<PostDto> findByComments(Long commentId) {
        List<Post> posts = postRepo.findByCommentsId(commentId);
        return posts.stream().map(postMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public PostDto assignComments(Long id, List<Long> commentIds) {
        Post post = postRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Post not found with id " + id));
        List<Comment> comments = commentRepo.findAllById(commentIds);
        post.setComments(comments);
        Post updatedPost = postRepo.save(post);
        return postMapper.entityToDto(updatedPost);
    }
}
