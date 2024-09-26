package com.project.education_app.mappers;

import com.project.education_app.dtos.ResourceDto;
import com.project.education_app.dtos.SemesterDto;
import com.project.education_app.entities.Resource;
import com.project.education_app.entities.Semester;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = {SyllabusMapper.class})
public interface ResourceMapper {
    ResourceMapper INSTANCE= Mappers.getMapper(ResourceMapper.class);

    ResourceDto entityToDto(Resource resource);

    List<ResourceDto> entitiesToDtos(List<Resource> resources);

    Resource dtoToEntity(ResourceDto resourceDto);
}
