package com.project.education_app.service;

import com.project.education_app.dtos.UnitDto;

import java.util.List;

public interface UnitService {
    UnitDto save(UnitDto unitDto);

    List<UnitDto> findAll();

    UnitDto findById(Long id);

    UnitDto update(Long id, UnitDto unitDto);

    void delete(Long id);

    List<UnitDto> findByName(String name);

    List<UnitDto> findByDescription(String description);

    List<UnitDto> findByLessonId(Long lessonId);

    UnitDto assignLessons(Long id, List<Long> lessonIds);
}
