package com.project.education_app.service.impl;

import com.project.education_app.dtos.AssignmentDto;
import com.project.education_app.dtos.BasicStudentDto;
import com.project.education_app.dtos.ProblemAnswerDto;
import com.project.education_app.entities.Assignment;
import com.project.education_app.entities.Faculty;
import com.project.education_app.entities.ProblemAnswer;
import com.project.education_app.entities.Student;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.AssignmentMapper;
import com.project.education_app.mappers.BasicFacultyMapper;
import com.project.education_app.repos.AssignmentRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.repos.ProblemAnswerRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.service.AssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AssignmentServiceImpl implements AssignmentService {

    private final AssignmentRepo assignmentRepo;
    private final FacultyRepo facultyRepo;
    private final StudentRepo studentRepo;
    private final ProblemAnswerRepo problemAnswerRepo;
    private final AssignmentMapper assignmentMapper;
    private final BasicFacultyMapper basicFacultyMapper;

    @Override
    public AssignmentDto createAssignment(AssignmentDto assignmentDto) {
        Faculty teacher = facultyRepo.findById(assignmentDto.getTeacher().getId())
                .orElseThrow(() -> new NotFoundException("Teacher not found with id:" + assignmentDto.getTeacher().getId()));
        Assignment assignment = assignmentMapper.dtoToEntity(assignmentDto);
        assignment.setTeacher(teacher);
        Assignment savedAssignment = assignmentRepo.save(assignment);
        AssignmentDto savedAssignmentDto = assignmentMapper.entityToDto(savedAssignment);
        savedAssignmentDto.setTeacher(basicFacultyMapper.entityToDto(savedAssignment.getTeacher()));
        return savedAssignmentDto;
    }

    @Override
    public List<AssignmentDto> findAll() {
        List<Assignment> assignments = assignmentRepo.findAll();
        return assignmentMapper.entitiesToDtos(assignments);
    }

    @Override
    public AssignmentDto findById(Long id) {
        Assignment assignment = assignmentRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Assignment not found with id:" + id));
        return assignmentMapper.entityToDto(assignment);
    }

    @Override
    public AssignmentDto updateAssignment(Long id, AssignmentDto assignmentDto) {
        Assignment assignment = assignmentRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Assignment not found with id:" + id));
        if (assignmentDto.getTitle() != null) {
            assignment.setTitle(assignmentDto.getTitle());
        }
        if (assignmentDto.getDueDate() != null) {
            assignment.setDueDate(assignmentDto.getDueDate());
        }
        if (assignmentDto.isCompleted() != assignment.isCompleted()) {
            assignment.setCompleted(assignmentDto.isCompleted());
        }
        if (assignmentDto.getTeacher() != null) {
            Faculty teacher = facultyRepo.findById(assignmentDto.getTeacher().getId())
                    .orElseThrow(() -> new NotFoundException("Teacher not found with id" + assignmentDto.getTeacher().getId()));
            assignment.setTeacher(teacher);
        }
        if (assignmentDto.getStudents() != null) {
            List<Student> students = studentRepo.findAllById(assignmentDto.getStudents().stream().map(BasicStudentDto::getId).collect(Collectors.toList()));
            assignment.setStudents(students);
        }
        if (assignmentDto.getProblemAnswers() != null) {
            List<ProblemAnswer> problemAnswers = problemAnswerRepo.findAllById(assignmentDto.getProblemAnswers().stream().map(ProblemAnswerDto::getId).collect(Collectors.toList()));
            assignment.setProblemAnswers(problemAnswers);
        }
        Assignment updatedAssignment = assignmentRepo.save(assignment);
        AssignmentDto updatedAssignmentDto = assignmentMapper.entityToDto(updatedAssignment);
        updatedAssignmentDto.setTeacher(basicFacultyMapper.entityToDto(updatedAssignment.getTeacher()));
        return updatedAssignmentDto;
    }

    @Override
    public void deleteAssignment(Long id) {
        Assignment assignment = assignmentRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Assignment not found with id:" + id));
        assignmentRepo.delete(assignment);
    }

    @Override
    public List<AssignmentDto> findByTitle(String title) {
        List<Assignment> assignments = assignmentRepo.findByTitleContaining(title);
        return assignmentMapper.entitiesToDtos(assignments);
    }

    @Override
    public List<AssignmentDto> findByTeacher(Long teacherId) {
        List<Assignment> assignments = assignmentRepo.findByTeacherId(teacherId);
        return assignmentMapper.entitiesToDtos(assignments);
    }

    @Override
    public List<AssignmentDto> findByDueDate(LocalDate dueDate) {
        List<Assignment> assignments = assignmentRepo.findByDueDate(dueDate);
        return assignmentMapper.entitiesToDtos(assignments);
    }

    @Override
    public List<AssignmentDto> findByCompleted(boolean completed) {
        List<Assignment> assignments = assignmentRepo.findByCompleted(completed);
        return assignmentMapper.entitiesToDtos(assignments);
    }

    @Override
    public AssignmentDto markComplete(Long id) {
        Assignment assignment = assignmentRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Assignment not found with id:" + id));
        assignment.setCompleted(true);
        assignmentRepo.save(assignment);
        return assignmentMapper.entityToDto(assignment);
    }

    @Override
    public AssignmentDto assignStudents(Long id, List<Long> studentIds) {
        Assignment assignment = assignmentRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Assignment not found with id:" + id));
        List<Student> students = studentRepo.findAllById(studentIds);
        assignment.setStudents(students);
        assignmentRepo.save(assignment);
        return assignmentMapper.entityToDto(assignment);
    }

    @Override
    public AssignmentDto assignProblemAnswers(Long id, List<Long> problemAnswerIds) {
        Assignment assignment = assignmentRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Assignment not found with id:" + id));
        List<ProblemAnswer> problemAnswers = problemAnswerRepo.findAllById(problemAnswerIds);
        assignment.setProblemAnswers(problemAnswers);
        assignmentRepo.save(assignment);
        return assignmentMapper.entityToDto(assignment);
    }
}
