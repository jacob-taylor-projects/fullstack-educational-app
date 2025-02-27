package com.project.education_app.service;

import com.project.education_app.dtos.LessonDto;

import java.util.List;

public interface LessonService {
    LessonDto save(LessonDto lessonDto);

    List<LessonDto> findAll();

    LessonDto findById(Long id);

    LessonDto update(Long id, LessonDto lessonDto);

    void delete(Long id);

    List<LessonDto> findByTitle(String title);

    List<LessonDto> findByContent(String content);

    List<LessonDto> findByAuthor(Long authorId);
}
