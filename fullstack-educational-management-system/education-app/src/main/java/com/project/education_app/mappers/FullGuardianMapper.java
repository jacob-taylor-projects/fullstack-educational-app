package com.project.education_app.mappers;

import com.project.education_app.dtos.BasicGuardianDto;
import com.project.education_app.dtos.FullGuardianDto;
import com.project.education_app.entities.Guardian;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CredentialMapper.class,ProfileMapper.class, BasicStudentMapper.class})
public interface FullGuardianMapper {
    FullGuardianMapper INSTANCE= Mappers.getMapper(FullGuardianMapper.class);
    FullGuardianDto entityToDto(Guardian guardian);

    List<FullGuardianDto> entitiesToDtos(List<Guardian> guardians);

    Guardian dtoToEntity(FullGuardianDto fullGuardianDto);
}
