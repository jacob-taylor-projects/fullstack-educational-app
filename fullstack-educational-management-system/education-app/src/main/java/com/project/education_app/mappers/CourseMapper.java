package com.project.education_app.mappers;

import com.project.education_app.dtos.CourseDto;
import com.project.education_app.dtos.CourseGradeDto;
import com.project.education_app.entities.Course;
import com.project.education_app.entities.CourseGrade;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { SyllabusMapper.class,AttendanceMapper.class,BasicStudentMapper.class, GradeMapper.class, ResourceMapper.class, UnitMapper.class, ScheduleMapper.class, SemesterMapper.class })
public interface CourseMapper {
    CourseMapper INSTANCE= Mappers.getMapper(CourseMapper.class);
    CourseDto entityToDto(Course course);

    List<CourseDto> entitiesToDtos(List<Course> courses);

    Course dtoToEntity(CourseDto courseDto);
}
