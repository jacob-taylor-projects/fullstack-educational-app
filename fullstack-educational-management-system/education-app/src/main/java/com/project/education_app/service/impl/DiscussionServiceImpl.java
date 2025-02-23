package com.project.education_app.service.impl;

import com.project.education_app.dtos.DiscussionDto;
import com.project.education_app.dtos.PostDto;
import com.project.education_app.entities.Discussion;
import com.project.education_app.entities.Faculty;
import com.project.education_app.entities.Post;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.DiscussionMapper;
import com.project.education_app.repos.DiscussionRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.PostRepo;
import com.project.education_app.service.DiscussionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DiscussionServiceImpl implements DiscussionService {

    private final DiscussionRepo discussionRepo;
    private final FacultyRepo facultyRepo;
    private final PostRepo postRepo;
    private final DiscussionMapper discussionMapper;

    @Override
    public DiscussionDto save(DiscussionDto discussionDto) {
        Faculty teacher = facultyRepo.findById(discussionDto.getTeacher().getId())
                .orElseThrow(() -> new NotFoundException("Teacher not found with id " + discussionDto.getTeacher().getId()));
        Discussion discussion = discussionMapper.dtoToEntity(discussionDto);
        discussion.setTeacher(teacher);
        Discussion savedDiscussion = discussionRepo.save(discussion);
        return discussionMapper.entityToDto(savedDiscussion);
    }

    @Override
    public List<DiscussionDto> findAll() {
        List<Discussion> discussions = discussionRepo.findAll();
        return discussions.stream().map(discussionMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public DiscussionDto findById(Long id) {
        Discussion discussion = discussionRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Discussion not found with id " + id));
        return discussionMapper.entityToDto(discussion);
    }

    @Override
    public DiscussionDto update(Long id, DiscussionDto discussionDto) {
        Discussion discussion = discussionRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Discussion not found with id " + id));
        if (discussionDto.getTitle() != null) {
            discussion.setTitle(discussionDto.getTitle());
        }
        if (discussionDto.getDescription() != null) {
            discussion.setDescription(discussionDto.getDescription());
        }
        if (discussionDto.getTeacher() != null) {
            Faculty teacher = facultyRepo.findById(discussionDto.getTeacher().getId())
                    .orElseThrow(() -> new NotFoundException("Teacher not found with id " + discussionDto.getTeacher().getId()));
            discussion.setTeacher(teacher);
        }
        if (discussionDto.getPosts() != null) {
            List<Post> posts = postRepo.findAllById(
                    discussionDto.getPosts().stream().map(PostDto::getId).collect(Collectors.toList()));
        }
        Discussion updatedDiscussion = discussionRepo.save(discussion);
        return discussionMapper.entityToDto(updatedDiscussion);
    }

    @Override
    public void delete(Long id) {
        Discussion discussion = discussionRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Discussion not found with id " + id));
        discussionRepo.delete(discussion);
    }

    @Override
    public List<DiscussionDto> findByTitle(String title) {
        List<Discussion> discussions = discussionRepo.findByTitleContaining(title);
        return discussions.stream().map(discussionMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<DiscussionDto> findByDescription(String description) {
        List<Discussion> discussions = discussionRepo.findByDescriptionContaining(description);
        return discussions.stream().map(discussionMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<DiscussionDto> findByTeacher(Long teacherId) {
        List<Discussion> discussions = discussionRepo.findByTeacherId(teacherId);
        return discussions.stream().map(discussionMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public DiscussionDto assignPosts(Long id, List<Long> postIds) {
        Discussion discussion = discussionRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Discussion not found with id " + id));
        List<Post> posts = postRepo.findAllById(postIds);
        discussion.setPosts(posts);
        Discussion updatedDiscussion = discussionRepo.save(discussion);
        return discussionMapper.entityToDto(updatedDiscussion);
    }
}
