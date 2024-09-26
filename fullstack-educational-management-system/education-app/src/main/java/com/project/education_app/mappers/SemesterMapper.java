package com.project.education_app.mappers;

import com.project.education_app.dtos.SemesterDto;
import com.project.education_app.dtos.SubmissionDto;
import com.project.education_app.entities.Semester;
import com.project.education_app.entities.Submission;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = { })
public interface SemesterMapper {
    SemesterMapper INSTANCE= Mappers.getMapper(SemesterMapper.class);
    SemesterDto entityToDto(Semester semester);

    List<SemesterDto> entitiesToDtos(List<Semester> semesters);

    Semester dtoToEntity(SemesterDto semesterDto);
}
