package com.project.education_app.mappers;

import com.project.education_app.dtos.BasicFacultyDto;
import com.project.education_app.dtos.FullFacultyDto;
import com.project.education_app.entities.Faculty;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CredentialMapper.class,ProfileMapper.class, AnnouncementMapper.class, GradeMapper.class, LessonMapper.class, DiscussionMapper.class, AssignmentMapper.class, ProjectMapper.class, TestMapper.class})
public interface FullFacultyMapper {
    FullFacultyMapper INSTANCE= Mappers.getMapper(FullFacultyMapper.class);
    FullFacultyDto entityToDto(Faculty faculty);

    List<FullFacultyDto> entitiesToDtos(List<Faculty> faculties);

    Faculty dtoToEntity(FullFacultyDto fullFacultyDto);
}
