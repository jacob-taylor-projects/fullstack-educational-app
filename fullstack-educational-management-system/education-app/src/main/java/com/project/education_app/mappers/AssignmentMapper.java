package com.project.education_app.mappers;

import com.project.education_app.dtos.AssignmentDto;
import com.project.education_app.entities.Assignment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProblemAnswerMapper.class, BasicFacultyMapper.class, BasicStudentMapper.class})
public interface AssignmentMapper {
    AssignmentMapper INSTANCE= Mappers.getMapper(AssignmentMapper.class);
    AssignmentDto entityToDto(Assignment assignment);

    List<AssignmentDto> entitiesToDtos(List<Assignment> assignments);

    Assignment dtoToEntity(AssignmentDto assignmentDto);
}
