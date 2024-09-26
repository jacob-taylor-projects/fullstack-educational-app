package com.project.education_app.mappers;

import com.project.education_app.dtos.CourseGradeDto;
import com.project.education_app.dtos.LessonDto;
import com.project.education_app.entities.CourseGrade;
import com.project.education_app.entities.Lesson;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CourseMapper.class,GradeMapper.class,BasicStudentMapper.class })
public interface CourseGradeMapper {
    CourseGradeMapper INSTANCE= Mappers.getMapper(CourseGradeMapper.class);
    CourseGradeDto entityToDto(CourseGrade courseGrade);

    List<CourseGradeDto> entitiesToDtos(List<CourseGrade> courseGrades);

    CourseGrade dtoToEntity(CourseGradeDto courseGradeDto);
}
