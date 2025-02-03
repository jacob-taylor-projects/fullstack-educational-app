package com.project.education_app.mappers;

import com.project.education_app.dtos.SyllabusDto;
import com.project.education_app.dtos.TestDto;
import com.project.education_app.entities.Syllabus;
import com.project.education_app.entities.Test;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ResourceMapper.class})
public interface SyllabusMapper {
    SyllabusMapper INSTANCE= Mappers.getMapper(SyllabusMapper.class);
    SyllabusDto entityToDto(Syllabus syllabus);

    List<SyllabusDto> entitiesToDtos(List<Syllabus> syllabi);

    Syllabus dtoToEntity(SyllabusDto syllabusDto);
}
