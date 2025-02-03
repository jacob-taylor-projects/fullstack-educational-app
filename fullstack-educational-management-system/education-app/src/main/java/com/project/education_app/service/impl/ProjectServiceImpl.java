package com.project.education_app.service.impl;

import com.project.education_app.dtos.AssignmentDto;
import com.project.education_app.dtos.BasicStudentDto;
import com.project.education_app.dtos.ProblemAnswerDto;
import com.project.education_app.dtos.ProjectDto;
import com.project.education_app.entities.*;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.AssignmentMapper;
import com.project.education_app.mappers.BasicFacultyMapper;
import com.project.education_app.mappers.ProjectMapper;
import com.project.education_app.repos.*;
import com.project.education_app.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepo projectRepo;
    private final FacultyRepo facultyRepo;
    private final StudentRepo studentRepo;
    private final ProblemAnswerRepo problemAnswerRepo;
    private final ProjectMapper projectMapper;
    private final BasicFacultyMapper basicFacultyMapper;

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {
        Faculty teacher = facultyRepo.findById(projectDto.getTeacher().getId())
                .orElseThrow(() -> new NotFoundException("Teacher not found with id:" + projectDto.getTeacher().getId()));
        Project project = projectMapper.dtoToEntity(projectDto);
        project.setTeacher(teacher);
        Project savedProject = projectRepo.save(project);
        ProjectDto savedProjectDto = projectMapper.entityToDto(savedProject);
        savedProjectDto.setTeacher(basicFacultyMapper.entityToDto(savedProject.getTeacher()));
        return savedProjectDto;
    }

    @Override
    public List<ProjectDto> findAll() {
        List<Project> projects = projectRepo.findAll();
        return projectMapper.entitiesToDtos(projects);
    }

    @Override
    public ProjectDto findById(Long id) {
        Project project = projectRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Project not found with id:" + id));
        return projectMapper.entityToDto(project);
    }

    @Override
    public ProjectDto updateProject(Long id, ProjectDto projectDto) {
        Project project = projectRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Project not found with id:" + id));
        if (projectDto.getName() != null) {
            project.setName(projectDto.getName());
        }
        if (projectDto.getDueDate() != null) {
            project.setDueDate(projectDto.getDueDate());
        }
        if (projectDto.isCompleted() != project.isCompleted()) {
            project.setCompleted(projectDto.isCompleted());
        }
        if (projectDto.getTeacher() != null) {
            Faculty teacher = facultyRepo.findById(projectDto.getTeacher().getId())
                    .orElseThrow(() -> new NotFoundException("Teacher not found with id" + projectDto.getTeacher().getId()));
            project.setTeacher(teacher);
        }
        if (projectDto.getStudents() != null) {
            List<Student> students = studentRepo.findAllById(projectDto.getStudents().stream().map(BasicStudentDto::getId).collect(Collectors.toList()));
            project.setStudents(students);
        }
        if (projectDto.getProblemAnswer() != null) {
            ProblemAnswer problemAnswers = problemAnswerRepo.findById(projectDto.getProblemAnswer().getId())
                    .orElseThrow(() -> new NotFoundException("Problem Answer not found with id" + projectDto.getProblemAnswer().getId()));
            project.setProblemAnswer(problemAnswers);
        }
        Project updatedProject = projectRepo.save(project);
        ProjectDto updatedProjectDto = projectMapper.entityToDto(updatedProject);
        updatedProjectDto.setTeacher(basicFacultyMapper.entityToDto(updatedProject.getTeacher()));
        return updatedProjectDto;
    }

    @Override
    public void deleteProject(Long id) {
        Project project = projectRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Project not found with id:" + id));
        projectRepo.delete(project);
    }

    @Override
    public List<ProjectDto> findByTitle(String title) {
        List<Project> projects = projectRepo.findByNameContaining(title);
        return projectMapper.entitiesToDtos(projects);
    }

    @Override
    public List<ProjectDto> findByTeacher(Long teacherId) {
        List<Project> projects = projectRepo.findByTeacherId(teacherId);
        return projectMapper.entitiesToDtos(projects);
    }

    @Override
    public List<ProjectDto> findByDueDate(LocalDate dueDate) {
        List<Project> projects = projectRepo.findByDueDate(dueDate);
        return projectMapper.entitiesToDtos(projects);
    }

    @Override
    public List<ProjectDto> findByCompleted(boolean completed) {
        List<Project> projects = projectRepo.findByCompleted(completed);
        return projectMapper.entitiesToDtos(projects);
    }

    @Override
    public ProjectDto markComplete(Long id) {
        Project project = projectRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Project not found with id:" + id));
        project.setCompleted(true);
        projectRepo.save(project);
        return projectMapper.entityToDto(project);
    }

    @Override
    public ProjectDto assignStudents(Long id, List<Long> studentIds) {
        Project project = projectRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Project not found with id:" + id));
        List<Student> students = studentRepo.findAllById(studentIds);
        project.setStudents(students);
        projectRepo.save(project);
        return projectMapper.entityToDto(project);
    }

    @Override
    public ProjectDto assignProblemAnswers(Long id, Long problemAnswerIds) {
        Project project = projectRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Project not found with id:" + id));
        ProblemAnswer problemAnswers = problemAnswerRepo.findById(problemAnswerIds)
                .orElseThrow(() -> new NotFoundException("Problem Answer not found with id" + problemAnswerIds));
        project.setProblemAnswer(problemAnswers);
        projectRepo.save(project);
        return projectMapper.entityToDto(project);
    }
}
