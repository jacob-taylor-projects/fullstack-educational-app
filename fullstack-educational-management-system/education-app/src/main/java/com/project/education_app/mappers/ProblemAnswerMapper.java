package com.project.education_app.mappers;

import com.project.education_app.dtos.AttendanceItemDto;
import com.project.education_app.dtos.ProblemAnswerDto;
import com.project.education_app.entities.Attendance;
import com.project.education_app.entities.ProblemAnswer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AssignmentMapper.class, ProjectMapper.class, TestMapper.class, StudentAnswerMapper.class})
public interface ProblemAnswerMapper {
    ProblemAnswerMapper INSTANCE = Mappers.getMapper(ProblemAnswerMapper.class);

    ProblemAnswerDto entityToDto(ProblemAnswer problemAnswer);

    List<ProblemAnswerDto> entitiesToDtos(List<ProblemAnswer> problemAnswers);

    ProblemAnswer dtoToEntity(ProblemAnswerDto problemAnswerDto);
}

