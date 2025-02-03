package com.project.education_app.service.impl;

import com.project.education_app.dtos.*;
import com.project.education_app.entities.*;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.BasicFacultyMapper;
import com.project.education_app.mappers.ProjectMapper;
import com.project.education_app.mappers.TestMapper;
import com.project.education_app.repos.*;
import com.project.education_app.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepo testRepo;
    private final FacultyRepo facultyRepo;
    private final StudentRepo studentRepo;
    private final ProblemAnswerRepo problemAnswerRepo;
    private final TestMapper testMapper;
    private final BasicFacultyMapper basicFacultyMapper;

    @Override
    public TestDto createTest(TestDto testDto) {
        Faculty teacher = facultyRepo.findById(testDto.getTeacher().getId())
                .orElseThrow(() -> new NotFoundException("Teacher not found with id:" + testDto.getTeacher().getId()));
        Test test = testMapper.dtoToEntity(testDto);
        test.setTeacher(teacher);
        Test savedTest = testRepo.save(test);
        TestDto savedTestDto = testMapper.entityToDto(savedTest);
        savedTestDto.setTeacher(basicFacultyMapper.entityToDto(savedTest.getTeacher()));
        return savedTestDto;
    }

    @Override
    public List<TestDto> findAll() {
        List<Test> tests = testRepo.findAll();
        return testMapper.entitiesToDtos(tests);
    }

    @Override
    public TestDto findById(Long id) {
        Test test = testRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Test not found with id:" + id));
        return testMapper.entityToDto(test);
    }

    @Override
    public TestDto updateTest(Long id, TestDto testDto) {
        Test test = testRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Test not found with id:" + id));
        if (testDto.getTitle() != null) {
            test.setTitle(testDto.getTitle());
        }
        if (testDto.getDueDate() != null) {
            test.setDueDate(testDto.getDueDate());
        }
        if (testDto.isCompleted() != test.isCompleted()) {
            test.setCompleted(testDto.isCompleted());
        }
        if (testDto.getTeacher() != null) {
            Faculty teacher = facultyRepo.findById(testDto.getTeacher().getId())
                    .orElseThrow(() -> new NotFoundException("Teacher not found with id" + testDto.getTeacher().getId()));
            test.setTeacher(teacher);
        }
        if (testDto.getStudents() != null) {
            List<Student> students = studentRepo.findAllById(testDto.getStudents().stream().map(BasicStudentDto::getId).collect(Collectors.toList()));
            test.setStudents(students);
        }
        if (testDto.getProblemAnswers() != null) {
            List<ProblemAnswer> problemAnswers = problemAnswerRepo.findAllById(testDto.getProblemAnswers().stream().map(ProblemAnswerDto::getId).collect(Collectors.toList()));
            test.setProblemAnswers(problemAnswers);
        }
        Test updatedTest = testRepo.save(test);
        TestDto updatedTestDto = testMapper.entityToDto(updatedTest);
        updatedTestDto.setTeacher(basicFacultyMapper.entityToDto(updatedTest.getTeacher()));
        return updatedTestDto;
    }

    @Override
    public void deleteTest(Long id) {
        Test test = testRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Test not found with id:" + id));
        testRepo.delete(test);
    }

    @Override
    public List<TestDto> findByTitle(String title) {
        List<Test> tests = testRepo.findByTitleContaining(title);
        return testMapper.entitiesToDtos(tests);
    }

    @Override
    public List<TestDto> findByTeacher(Long teacherId) {
        List<Test> tests = testRepo.findByTeacherId(teacherId);
        return testMapper.entitiesToDtos(tests);
    }

    @Override
    public List<TestDto> findByDueDate(LocalDate dueDate) {
        List<Test> tests = testRepo.findByDueDate(dueDate);
        return testMapper.entitiesToDtos(tests);
    }

    @Override
    public List<TestDto> findByCompleted(boolean completed) {
        List<Test> tests = testRepo.findByCompleted(completed);
        return testMapper.entitiesToDtos(tests);
    }

    @Override
    public TestDto markComplete(Long id) {
        Test test = testRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Test not found with id:" + id));
        test.setCompleted(true);
        testRepo.save(test);
        return testMapper.entityToDto(test);
    }

    @Override
    public TestDto assignStudents(Long id, List<Long> studentIds) {
        Test test = testRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Test not found with id:" + id));
        List<Student> students = studentRepo.findAllById(studentIds);
        test.setStudents(students);
        testRepo.save(test);
        return testMapper.entityToDto(test);
    }

    @Override
    public TestDto assignProblemAnswers(Long id, List<Long> problemAnswerIds) {
        Test test = testRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Test not found with id:" + id));
        List<ProblemAnswer> problemAnswers = problemAnswerRepo.findAllById(problemAnswerIds);
        test.setProblemAnswers(problemAnswers);
        testRepo.save(test);
        return testMapper.entityToDto(test);
    }
}
