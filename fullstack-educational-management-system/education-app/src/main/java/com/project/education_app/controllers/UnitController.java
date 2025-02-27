package com.project.education_app.controllers;

import com.project.education_app.dtos.UnitDto;
import com.project.education_app.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/units")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UnitController {
    private final UnitService unitService;

    // Create Unit
    @PostMapping
    public UnitDto createUnit(@RequestBody UnitDto unitDto) {
        return unitService.save(unitDto);
    }

    // Read All Units
    @GetMapping
    public List<UnitDto> getAllUnits() {
        return unitService.findAll();
    }

    // Read Unit by ID
    @GetMapping("/{id}")
    public UnitDto getUnitById(@PathVariable Long id) {
        return unitService.findById(id);
    }

    // Update Unit (using PATCH)
    @PatchMapping("/{id}")
    public UnitDto updateUnit(@PathVariable Long id, @RequestBody UnitDto unitDto) {
        return unitService.update(id, unitDto);
    }

    // Delete Unit
    @DeleteMapping("/{id}")
    public void deleteUnit(@PathVariable Long id) {
        unitService.delete(id);
    }

    // Find Units by Name
    @GetMapping("/name/{name}")
    public List<UnitDto> findByName(@PathVariable String name) {
        return unitService.findByName(name);
    }

    // Find Units by Description
    @GetMapping("/description/{description}")
    public List<UnitDto> findByDescription(@PathVariable String description) {
        return unitService.findByDescription(description);
    }

    // Find Units by Lesson ID
    @GetMapping("/lessons/{lessonId}")
    public List<UnitDto> findByLessonId(@PathVariable Long lessonId) {
        return unitService.findByLessonId(lessonId);
    }

    // Assign Lessons to Unit
    @PostMapping("/{id}/lessons")
    public UnitDto assignLessonsToUnit(@PathVariable Long id, @RequestBody List<Long> lessonIds) {
        return unitService.assignLessons(id, lessonIds);
    }
}
