package com.project.education_app.mappers;

import com.project.education_app.dtos.SubmissionDto;
import com.project.education_app.dtos.SyllabusDto;
import com.project.education_app.entities.Submission;
import com.project.education_app.entities.Syllabus;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {BasicStudentMapper.class})
public interface SubmissionMapper {
    SubmissionMapper INSTANCE = Mappers.getMapper(SubmissionMapper.class);

    SubmissionDto entityToDto(Submission submission);

    List<SubmissionDto> entitiesToDtos(List<Submission> submissions);

    Submission dtoToEntity(SubmissionDto submissionDto);
}

