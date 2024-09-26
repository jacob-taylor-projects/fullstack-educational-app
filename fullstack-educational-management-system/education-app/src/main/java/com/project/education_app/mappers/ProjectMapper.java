package com.project.education_app.mappers;

import com.project.education_app.dtos.ProjectDto;
import com.project.education_app.dtos.ResourceDto;
import com.project.education_app.entities.Project;
import com.project.education_app.entities.Resource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { BasicFacultyMapper.class,BasicStudentMapper.class, SyllabusMapper.class})
public interface ProjectMapper {
    ProjectMapper INSTANCE= Mappers.getMapper(ProjectMapper.class);

    ProjectDto entityToDto(Project project);

    List<ProjectDto> entitiesToDtos(List<Project> projects);

    Project dtoToEntity(ProjectDto projectDto);
}
