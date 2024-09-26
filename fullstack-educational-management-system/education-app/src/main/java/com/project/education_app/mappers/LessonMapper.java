package com.project.education_app.mappers;

import com.project.education_app.dtos.LessonDto;
import com.project.education_app.dtos.UnitDto;
import com.project.education_app.entities.Lesson;
import com.project.education_app.entities.Unit;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { BasicFacultyMapper.class})
public interface LessonMapper {
    LessonMapper INSTANCE= Mappers.getMapper(LessonMapper.class);
    LessonDto entityToDto(Lesson lesson);

    List<LessonDto> entitiesToDtos(List<Lesson> lessons);

    Lesson dtoToEntity(LessonDto lessonDto);
}
