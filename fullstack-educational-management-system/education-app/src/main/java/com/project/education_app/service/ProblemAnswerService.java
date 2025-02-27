package com.project.education_app.service;

import com.project.education_app.dtos.ProblemAnswerDto;

import java.util.List;

public interface ProblemAnswerService {
    ProblemAnswerDto save(ProblemAnswerDto problemAnswerDto);

    List<ProblemAnswerDto> findAll();

    ProblemAnswerDto findById(Long id);

    ProblemAnswerDto update(Long id, ProblemAnswerDto problemAnswerDto);

    void delete(Long id);

    List<ProblemAnswerDto> findByProblemContent(String problemContent);

    List<ProblemAnswerDto> findByAnswerContent(String answerContent);
}
