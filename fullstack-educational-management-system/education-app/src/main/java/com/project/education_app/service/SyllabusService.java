package com.project.education_app.service;

import com.project.education_app.dtos.SyllabusDto;

import java.util.List;

public interface SyllabusService {

        SyllabusDto save(SyllabusDto syllabusDto);

        List<SyllabusDto> findAll();

        SyllabusDto findById(Long id);

        SyllabusDto update(Long id, SyllabusDto syllabusDto);

        void delete(Long id);

        List<SyllabusDto> findByObjectives(String objectives);

        List<SyllabusDto> findByTopics(String topics);

        List<SyllabusDto> findByEvaluationCriteria(String criteria);

        List<SyllabusDto> findByCourseId(Long courseId);

        List<SyllabusDto> findByAssignmentsId(Long assignmentId);

        List<SyllabusDto> findByProjectsId(Long projectId);

        List<SyllabusDto> findByTestsId(Long testId);

        List<SyllabusDto> findByResourcesId(Long resourceId);

        SyllabusDto assignAssignments(Long id, List<Long> assignmentIds);

        SyllabusDto assignProjects(Long id, List<Long> projectIds);

        SyllabusDto assignTests(Long id, List<Long> testIds);

        SyllabusDto assignResources(Long id, List<Long> resourceIds);
}
