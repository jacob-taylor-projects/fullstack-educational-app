package com.project.education_app.mappers;

import com.project.education_app.dtos.CourseGradeDto;
import com.project.education_app.dtos.GradeDto;
import com.project.education_app.entities.CourseGrade;
import com.project.education_app.entities.Grade;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { BasicFacultyMapper.class, SubmissionMapper.class,BasicStudentMapper.class })
public interface GradeMapper {
    GradeMapper INSTANCE= Mappers.getMapper(GradeMapper.class);
    GradeDto entityToDto(Grade grade);

    List<GradeDto> entitiesToDtos(List<Grade> grades);

    Grade dtoToEntity(GradeDto gradeDto);
}
