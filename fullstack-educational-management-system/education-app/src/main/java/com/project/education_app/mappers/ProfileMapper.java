package com.project.education_app.mappers;

import com.project.education_app.dtos.ProfileDto;
import com.project.education_app.entities.Profile;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileMapper INSTANCE= Mappers.getMapper(ProfileMapper.class);
    Profile dtoToEntity(ProfileDto profileDto);

    ProfileDto entityToDto(Profile profile);
}
