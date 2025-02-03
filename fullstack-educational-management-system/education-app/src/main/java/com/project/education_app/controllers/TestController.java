package com.project.education_app.controllers;

import com.project.education_app.dtos.AssignmentDto;
import com.project.education_app.dtos.TestDto;
import com.project.education_app.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TestController {
    private final TestService testService;

    @PostMapping
    public TestDto createTest(@RequestBody TestDto testDto) {
        return testService.createTest(testDto);
    }

    @GetMapping
    public List<TestDto> getAllTests() {
        return testService.findAll();
    }

    @GetMapping("/{id}")
    public TestDto getTestById(@PathVariable Long id) {
        return testService.findById(id);
    }

    @PatchMapping("/{id}")
    public TestDto updateTest(@PathVariable Long id, @RequestBody TestDto testDto) {
        return testService.updateTest(id, testDto);
    }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        testService.deleteTest(id);
    }

    @GetMapping("/title/{title}")
    public List<TestDto> findByTitle(@PathVariable String title) {
        return testService.findByTitle(title);
    }

    @GetMapping("/teacher/{teacherId}")
    public List<TestDto> findByTeacher(@PathVariable Long teacherId) {
        return testService.findByTeacher(teacherId);
    }

    @GetMapping("/due/{dueDate}")
    public List<TestDto> findByDueDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dueDate) {
        return testService.findByDueDate(dueDate);
    }

    @GetMapping("/completed/{completed}")
    public List<TestDto> findByCompleted(@PathVariable boolean completed) {
        return testService.findByCompleted(completed);
    }

    @PatchMapping("/{id}/complete")
    public TestDto markComplete(@PathVariable Long id) {
        return testService.markComplete(id);
    }

    @PostMapping("/{id}/students")
    public TestDto assignStudentsToTest(@PathVariable Long id, @RequestBody List<Long> studentIds) {
        return testService.assignStudents(id, studentIds);
    }

    @PostMapping("/{id}/problemAnswers")
    public TestDto assignProblemAnswersToTest(@PathVariable Long id, @RequestBody List<Long> problemAnswerIds) {
        return testService.assignProblemAnswers(id, problemAnswerIds);
    }
}
