package com.project.education_app.service.impl;

import com.project.education_app.dtos.SyllabusDto;
import com.project.education_app.entities.*;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.SyllabusMapper;
import com.project.education_app.repos.*;
import com.project.education_app.service.SyllabusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SyllabusServiceImpl implements SyllabusService {

    private final SyllabusRepo syllabusRepo;
    private final ProjectRepo projectRepo;
    private final AssignmentRepo assignmentRepo;
    private final TestRepo testRepo;
    private final ResourceRepo resourceRepo;
    private final SyllabusMapper syllabusMapper;

    @Override
    public SyllabusDto save(SyllabusDto syllabusDto) {
        Syllabus syllabus = syllabusMapper.dtoToEntity(syllabusDto);
        Syllabus savedSyllabus = syllabusRepo.save(syllabus);
        return syllabusMapper.entityToDto(savedSyllabus);
    }

    @Override
    public List<SyllabusDto> findAll() {
        List<Syllabus> syllabi = syllabusRepo.findAll();
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public SyllabusDto findById(Long id) {
        Syllabus syllabus = syllabusRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Syllabus not found with id: " + id));
        return syllabusMapper.entityToDto(syllabus);
    }

    @Override
    public SyllabusDto update(Long id, SyllabusDto syllabusDto) {
        Syllabus syllabus = syllabusRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Syllabus not found with id: " + id));

        if (syllabusDto.getObjectives() != null) {
            syllabus.setObjectives(syllabusDto.getObjectives());
        }
        if (syllabusDto.getTopics() != null) {
            syllabus.setTopics(syllabusDto.getTopics());
        }
        if (syllabusDto.getEvaluationCriteria() != null) {
            syllabus.setEvaluationCriteria(syllabusDto.getEvaluationCriteria());
        }

        Syllabus updatedSyllabus = syllabusRepo.save(syllabus);
        return syllabusMapper.entityToDto(updatedSyllabus);
    }

    @Override
    public void delete(Long id) {
        Syllabus syllabus = syllabusRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Syllabus not found with id: " + id));
        syllabusRepo.delete(syllabus);
    }

    @Override
    public List<SyllabusDto> findByObjectives(String objectives) {
        List<Syllabus> syllabi = syllabusRepo.findByObjectivesContaining(objectives);
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SyllabusDto> findByTopics(String topics) {
        List<Syllabus> syllabi = syllabusRepo.findByTopicsContaining(topics);
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SyllabusDto> findByEvaluationCriteria(String criteria) {
        List<Syllabus> syllabi = syllabusRepo.findByEvaluationCriteriaContaining(criteria);
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SyllabusDto> findByCourseId(Long courseId) {
        List<Syllabus> syllabi = syllabusRepo.findByCourseId(courseId);
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SyllabusDto> findByAssignmentsId(Long assignmentId) {
        List<Syllabus> syllabi = syllabusRepo.findByAssignmentsId(assignmentId);
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SyllabusDto> findByProjectsId(Long projectId) {
        List<Syllabus> syllabi = syllabusRepo.findByProjectsId(projectId);
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SyllabusDto> findByTestsId(Long testId) {
        List<Syllabus> syllabi = syllabusRepo.findByTestsId(testId);
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<SyllabusDto> findByResourcesId(Long resourceId) {
        List<Syllabus> syllabi = syllabusRepo.findByResourcesId(resourceId);
        return syllabi.stream().map(syllabusMapper::entityToDto).collect(Collectors.toList());
    }


    @Override
    public SyllabusDto assignAssignments(Long id, List<Long> assignmentIds) {
        Syllabus syllabus = syllabusRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Syllabus not found with id: " + id));
        List<Assignment> assignments = assignmentRepo.findAllById(assignmentIds);
        syllabus.setAssignments(assignments);
        Syllabus updatedSyllabus = syllabusRepo.save(syllabus);
        return syllabusMapper.entityToDto(updatedSyllabus);
    }

    @Override
    public SyllabusDto assignProjects(Long id, List<Long> projectIds) {
        Syllabus syllabus = syllabusRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Syllabus not found with id: " + id));
        List<Project> projects = projectRepo.findAllById(projectIds);
        syllabus.setProjects(projects);
        Syllabus updatedSyllabus = syllabusRepo.save(syllabus);
        return syllabusMapper.entityToDto(updatedSyllabus);
    }

    @Override
    public SyllabusDto assignTests(Long id, List<Long> testIds) {
        Syllabus syllabus = syllabusRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Syllabus not found with id: " + id));
        List<Test> tests = testRepo.findAllById(testIds);
        syllabus.setTests(tests);
        Syllabus updatedSyllabus = syllabusRepo.save(syllabus);
        return syllabusMapper.entityToDto(updatedSyllabus);
    }

    @Override
    public SyllabusDto assignResources(Long id, List<Long> resourceIds) {
        Syllabus syllabus = syllabusRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Syllabus not found with id: " + id));
        List<Resource> resources = resourceRepo.findAllById(resourceIds);
        syllabus.setResources(resources);
        Syllabus updatedSyllabus = syllabusRepo.save(syllabus);
        return syllabusMapper.entityToDto(updatedSyllabus);
    }


}
