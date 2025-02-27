package com.project.education_app.service.impl;

import com.project.education_app.dtos.UnitDto;
import com.project.education_app.entities.Lesson;
import com.project.education_app.entities.Unit;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.UnitMapper;
import com.project.education_app.repos.LessonRepo;
import com.project.education_app.repos.UnitRepo;
import com.project.education_app.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UnitServiceImpl implements UnitService {

    private final UnitRepo unitRepo;
    private final LessonRepo lessonRepo;
    private final UnitMapper unitMapper;

    @Override
    public UnitDto save(UnitDto unitDto) {
        Unit unit = unitMapper.dtoToEntity(unitDto);
        Unit savedUnit = unitRepo.save(unit);
        return unitMapper.entityToDto(savedUnit);
    }

    @Override
    public List<UnitDto> findAll() {
        List<Unit> units = unitRepo.findAll();
        return units.stream().map(unitMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public UnitDto findById(Long id) {
        Unit unit = unitRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Unit not found with id: " + id));
        return unitMapper.entityToDto(unit);
    }

    @Override
    public UnitDto update(Long id, UnitDto unitDto) {
        Unit unit = unitRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Unit not found with id: " + id));

        if (unitDto.getName() != null) {
            unit.setName(unitDto.getName());
        }
        if (unitDto.getDescription() != null) {
            unit.setDescription(unitDto.getDescription());
        }

        Unit updatedUnit = unitRepo.save(unit);
        return unitMapper.entityToDto(updatedUnit);
    }

    @Override
    public void delete(Long id) {
        Unit unit = unitRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Unit not found with id: " + id));
        unitRepo.delete(unit);
    }

    @Override
    public List<UnitDto> findByName(String name) {
        List<Unit> units = unitRepo.findByNameContaining(name);
        return units.stream().map(unitMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<UnitDto> findByDescription(String description) {
        List<Unit> units = unitRepo.findByDescriptionContaining(description);
        return units.stream().map(unitMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<UnitDto> findByLessonId(Long lessonId) {
        List<Unit> units = unitRepo.findByLessonsId(lessonId);
        return units.stream().map(unitMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public UnitDto assignLessons(Long id, List<Long> lessonIds) {
        Unit unit = unitRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Unit not found with id: " + id));
        List<Lesson> lessons = lessonRepo.findAllById(lessonIds);
        unit.setLessons(lessons);
        Unit updatedUnit = unitRepo.save(unit);
        return unitMapper.entityToDto(updatedUnit);
    }
}
