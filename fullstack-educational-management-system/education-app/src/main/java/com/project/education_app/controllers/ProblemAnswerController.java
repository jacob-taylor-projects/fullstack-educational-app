package com.project.education_app.controllers;

import com.project.education_app.dtos.ProblemAnswerDto;
import com.project.education_app.service.ProblemAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problem-answers")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProblemAnswerController {
    private final ProblemAnswerService problemAnswerService;

    // Create Problem Answer
    @PostMapping
    public ProblemAnswerDto createProblemAnswer(@RequestBody ProblemAnswerDto problemAnswerDto) {
        return problemAnswerService.save(problemAnswerDto);
    }

    // Read All Problem Answers
    @GetMapping
    public List<ProblemAnswerDto> getAllProblemAnswers() {
        return problemAnswerService.findAll();
    }

    // Read Problem Answer by ID
    @GetMapping("/{id}")
    public ProblemAnswerDto getProblemAnswerById(@PathVariable Long id) {
        return problemAnswerService.findById(id);
    }

    // Update Problem Answer (using PATCH)
    @PatchMapping("/{id}")
    public ProblemAnswerDto updateProblemAnswer(@PathVariable Long id, @RequestBody ProblemAnswerDto problemAnswerDto) {
        return problemAnswerService.update(id, problemAnswerDto);
    }

    // Delete Problem Answer
    @DeleteMapping("/{id}")
    public void deleteProblemAnswer(@PathVariable Long id) {
        problemAnswerService.delete(id);
    }

    // Find Problem Answers by Problem Content
    @GetMapping("/problem-content/{content}")
    public List<ProblemAnswerDto> findByProblemContent(@PathVariable String content) {
        return problemAnswerService.findByProblemContent(content);
    }

    // Find Problem Answers by Answer Content
    @GetMapping("/answer-content/{content}")
    public List<ProblemAnswerDto> findByAnswerContent(@PathVariable String content) {
        return problemAnswerService.findByAnswerContent(content);
    }
}
