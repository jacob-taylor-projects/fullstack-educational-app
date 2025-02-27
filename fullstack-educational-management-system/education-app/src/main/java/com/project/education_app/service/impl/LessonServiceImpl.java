package com.project.education_app.service.impl;

import com.project.education_app.dtos.LessonDto;
import com.project.education_app.entities.Faculty;
import com.project.education_app.entities.Lesson;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.LessonMapper;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.LessonRepo;
import com.project.education_app.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LessonServiceImpl implements LessonService {

    private final LessonRepo lessonRepo;
    private final FacultyRepo facultyRepo;
    private final LessonMapper lessonMapper;

    @Override
    public LessonDto save(LessonDto lessonDto) {
        Faculty author = facultyRepo.findById(lessonDto.getAuthor().getId())
                .orElseThrow(() -> new NotFoundException("Author not found with id: " + lessonDto.getAuthor().getId()));
        Lesson lesson = lessonMapper.dtoToEntity(lessonDto);
        lesson.setAuthor(author);
        Lesson savedLesson = lessonRepo.save(lesson);
        return lessonMapper.entityToDto(savedLesson);
    }

    @Override
    public List<LessonDto> findAll() {
        List<Lesson> lessons = lessonRepo.findAll();
        return lessons.stream().map(lessonMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public LessonDto findById(Long id) {
        Lesson lesson = lessonRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Lesson not found with id: " + id));
        return lessonMapper.entityToDto(lesson);
    }

    @Override
    public LessonDto update(Long id, LessonDto lessonDto) {
        Lesson lesson = lessonRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Lesson not found with id: " + id));

        if (lessonDto.getTitle() != null) {
            lesson.setTitle(lessonDto.getTitle());
        }
        if (lessonDto.getContent() != null) {
            lesson.setContent(lessonDto.getContent());
        }
        if (lessonDto.getAuthor() != null) {
            Faculty author = facultyRepo.findById(lessonDto.getAuthor().getId())
                    .orElseThrow(() -> new NotFoundException("Author not found with id: " + lessonDto.getAuthor().getId()));
            lesson.setAuthor(author);
        }

        Lesson updatedLesson = lessonRepo.save(lesson);
        return lessonMapper.entityToDto(updatedLesson);
    }

    @Override
    public void delete(Long id) {
        Lesson lesson = lessonRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Lesson not found with id: " + id));
        lessonRepo.delete(lesson);
    }

    @Override
    public List<LessonDto> findByTitle(String title) {
        List<Lesson> lessons = lessonRepo.findByTitleContaining(title);
        return lessons.stream().map(lessonMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<LessonDto> findByContent(String content) {
        List<Lesson> lessons = lessonRepo.findByContentContaining(content);
        return lessons.stream().map(lessonMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<LessonDto> findByAuthor(Long authorId) {
        List<Lesson> lessons = lessonRepo.findByAuthorId(authorId);
        return lessons.stream().map(lessonMapper::entityToDto).collect(Collectors.toList());
    }
}
