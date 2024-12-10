package com.project.education_app.mappers;

import com.project.education_app.dtos.StudentAnswerDto;
import com.project.education_app.entities.StudentAnswer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {BasicStudentMapper.class, SubmissionMapper.class})
public interface StudentAnswerMapper {
    StudentAnswerMapper INSTANCE = Mappers.getMapper(StudentAnswerMapper.class);

    StudentAnswerDto entityToDto(StudentAnswer studentAnswer);

    List<StudentAnswerDto> entitiesToDtos(List<StudentAnswer> studentAnswers);

    StudentAnswer dtoToEntity(StudentAnswerDto studentAnswerDto);
}

