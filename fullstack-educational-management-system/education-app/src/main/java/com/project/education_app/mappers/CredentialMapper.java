package com.project.education_app.mappers;

import com.project.education_app.dtos.CredentialDto;
import com.project.education_app.entities.Credential;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CredentialMapper {
    CredentialMapper INSTANCE= Mappers.getMapper(CredentialMapper.class);
    Credential dtoToEntity(CredentialDto credentialDto);
}
