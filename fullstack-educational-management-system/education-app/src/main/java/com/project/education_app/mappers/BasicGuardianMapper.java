package com.project.education_app.mappers;

import com.project.education_app.dtos.BasicFacultyDto;
import com.project.education_app.dtos.BasicGuardianDto;
import com.project.education_app.entities.Faculty;
import com.project.education_app.entities.Guardian;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CredentialMapper.class,ProfileMapper.class})
public interface BasicGuardianMapper {
    BasicGuardianMapper INSTANCE= Mappers.getMapper(BasicGuardianMapper.class);
    BasicGuardianDto entityToDto(Guardian guardian);

    List<BasicGuardianDto> entitiesToDtos(List<Guardian> guardians);

   Guardian dtoToEntity(BasicGuardianDto basicGuardianDto);
}
