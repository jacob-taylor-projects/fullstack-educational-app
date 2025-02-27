package com.project.education_app.service.impl;

import com.project.education_app.dtos.StudentAnswerDto;
import com.project.education_app.entities.ProblemAnswer;
import com.project.education_app.entities.Student;
import com.project.education_app.entities.StudentAnswer;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.StudentAnswerMapper;
import com.project.education_app.repos.ProblemAnswerRepo;
import com.project.education_app.repos.StudentAnswerRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.service.StudentAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentAnswerServiceImpl implements StudentAnswerService {

    private StudentAnswerRepo studentAnswerRepo;
    private StudentRepo studentRepo;
    private ProblemAnswerRepo problemAnswerRepo;
    private StudentAnswerMapper studentAnswerMapper;

    @Override
    public StudentAnswerDto save(StudentAnswerDto studentAnswerDto) {
        Student student = studentRepo.findById(studentAnswerDto.getStudent().getId())
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + studentAnswerDto.getStudent().getId()));
        ProblemAnswer problemAnswer = problemAnswerRepo.findById(studentAnswerDto.getProblemAnswer().getId())
                .orElseThrow(() -> new NotFoundException("Problem answer not found with id: " + studentAnswerDto.getProblemAnswer().getId()));
        StudentAnswer studentAnswer = studentAnswerMapper.dtoToEntity(studentAnswerDto);
        studentAnswer.setStudent(student);
        studentAnswer.setProblemAnswer(problemAnswer);
        StudentAnswer savedStudentAnswer = studentAnswerRepo.save(studentAnswer);
        return studentAnswerMapper.entityToDto(savedStudentAnswer);
    }

    @Override
    public List<StudentAnswerDto> findAll() {
        List<StudentAnswer> studentAnswers = studentAnswerRepo.findAll();
        return studentAnswers.stream().map(studentAnswerMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public StudentAnswerDto findById(Long id) {
        StudentAnswer studentAnswer = studentAnswerRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Student answer not found with id: " + id));
        return studentAnswerMapper.entityToDto(studentAnswer);
    }

    @Override
    public StudentAnswerDto update(Long id, StudentAnswerDto studentAnswerDto) {
        StudentAnswer studentAnswer = studentAnswerRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Student answer not found with id: " + id));

        if (studentAnswerDto.getStudent() != null) {
            Student student = studentRepo.findById(studentAnswerDto.getStudent().getId())
                    .orElseThrow(() -> new NotFoundException("Student not found with id: " + studentAnswerDto.getStudent().getId()));
            studentAnswer.setStudent(student);
        }
        if (studentAnswerDto.getProblemAnswer() != null) {
            ProblemAnswer problemAnswer = problemAnswerRepo.findById(studentAnswerDto.getProblemAnswer().getId())
                    .orElseThrow(() -> new NotFoundException("Problem answer not found with id: " + studentAnswerDto.getProblemAnswer().getId()));
            studentAnswer.setProblemAnswer(problemAnswer);
        }
        if (studentAnswerDto.getAnswerContent() != null) {
            studentAnswer.setAnswerContent(studentAnswerDto.getAnswerContent());
        }
        if (studentAnswerDto.getSubmissionDate() != null) {
            studentAnswer.setSubmissionDate(studentAnswerDto.getSubmissionDate());
        }

        StudentAnswer updatedStudentAnswer = studentAnswerRepo.save(studentAnswer);
        return studentAnswerMapper.entityToDto(updatedStudentAnswer);
    }

    @Override
    public void delete(Long id) {
        StudentAnswer studentAnswer = studentAnswerRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Student answer not found with id: " + id));
        studentAnswerRepo.delete(studentAnswer);
    }

    @Override
    public List<StudentAnswerDto> findByStudent(Long studentId) {
        List<StudentAnswer> studentAnswers = studentAnswerRepo.findByStudentId(studentId);
        return studentAnswers.stream().map(studentAnswerMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<StudentAnswerDto> findByProblemAnswer(Long problemAnswerId) {
        List<StudentAnswer> studentAnswers = studentAnswerRepo.findByProblemAnswerId(problemAnswerId);
        return studentAnswers.stream().map(studentAnswerMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<StudentAnswerDto> findByAnswerContent(String answerContent) {
        List<StudentAnswer> studentAnswers = studentAnswerRepo.findByAnswerContentContaining(answerContent);
        return studentAnswers.stream().map(studentAnswerMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<StudentAnswerDto> findBySubmissionDate(Timestamp submissionDate) {
        List<StudentAnswer> studentAnswers = studentAnswerRepo.findBySubmissionDate(submissionDate);
        return studentAnswers.stream().map(studentAnswerMapper::entityToDto).collect(Collectors.toList());
    }
}
