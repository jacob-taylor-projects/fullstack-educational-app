package com.project.education_app.service.impl;

import com.project.education_app.dtos.ProblemAnswerDto;
import com.project.education_app.entities.ProblemAnswer;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.ProblemAnswerMapper;
import com.project.education_app.repos.ProblemAnswerRepo;
import com.project.education_app.service.ProblemAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProblemAnswerServiceImpl implements ProblemAnswerService {

    private final ProblemAnswerRepo problemAnswerRepo;
    private final ProblemAnswerMapper problemAnswerMapper;

    @Override
    public ProblemAnswerDto save(ProblemAnswerDto problemAnswerDto) {
        ProblemAnswer problemAnswer = problemAnswerMapper.dtoToEntity(problemAnswerDto);
        ProblemAnswer savedProblemAnswer = problemAnswerRepo.save(problemAnswer);
        return problemAnswerMapper.entityToDto(savedProblemAnswer);
    }

    @Override
    public List<ProblemAnswerDto> findAll() {
        List<ProblemAnswer> problemAnswers = problemAnswerRepo.findAll();
        return problemAnswers.stream().map(problemAnswerMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public ProblemAnswerDto findById(Long id) {
        ProblemAnswer problemAnswer = problemAnswerRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Problem answer not found with id: " + id));
        return problemAnswerMapper.entityToDto(problemAnswer);
    }

    @Override
    public ProblemAnswerDto update(Long id, ProblemAnswerDto problemAnswerDto) {
        ProblemAnswer problemAnswer = problemAnswerRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Problem answer not found with id: " + id));

        if (problemAnswerDto.getProblemContent() != null) {
            problemAnswer.setProblemContent(problemAnswerDto.getProblemContent());
        }
        if (problemAnswerDto.getAnswerContent() != null) {
            problemAnswer.setAnswerContent(problemAnswerDto.getAnswerContent());
        }

        ProblemAnswer updatedProblemAnswer = problemAnswerRepo.save(problemAnswer);
        return problemAnswerMapper.entityToDto(updatedProblemAnswer);
    }

    @Override
    public void delete(Long id) {
        ProblemAnswer problemAnswer = problemAnswerRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Problem answer not found with id: " + id));
        problemAnswerRepo.delete(problemAnswer);
    }

    @Override
    public List<ProblemAnswerDto> findByProblemContent(String problemContent) {
        List<ProblemAnswer> problemAnswers = problemAnswerRepo.findByProblemContentContaining(problemContent);
        return problemAnswers.stream().map(problemAnswerMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<ProblemAnswerDto> findByAnswerContent(String answerContent) {
        List<ProblemAnswer> problemAnswers = problemAnswerRepo.findByAnswerContentContaining(answerContent);
        return problemAnswers.stream().map(problemAnswerMapper::entityToDto).collect(Collectors.toList());
    }
}
