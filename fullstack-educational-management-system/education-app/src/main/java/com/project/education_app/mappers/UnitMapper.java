package com.project.education_app.mappers;

import com.project.education_app.dtos.UnitDto;
import com.project.education_app.entities.Unit;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = {LessonMapper.class})
public interface UnitMapper {
    UnitMapper INSTANCE= Mappers.getMapper(UnitMapper.class);
    UnitDto entityToDto(Unit unit);

    List<UnitDto> entitiesToDtos(List<Unit> units);

    Unit dtoToEntity(UnitDto unitDto);
}
