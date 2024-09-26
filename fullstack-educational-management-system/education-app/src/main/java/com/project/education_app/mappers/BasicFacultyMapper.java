package com.project.education_app.mappers;

import com.project.education_app.dtos.AttendanceDto;
import com.project.education_app.dtos.BasicFacultyDto;
import com.project.education_app.entities.Attendance;
import com.project.education_app.entities.Faculty;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CredentialMapper.class,ProfileMapper.class})
public interface BasicFacultyMapper {
    BasicFacultyMapper INSTANCE= Mappers.getMapper(BasicFacultyMapper.class);
    BasicFacultyDto entityToDto(Faculty faculty);

    List<BasicFacultyDto> entitiesToDtos(List<Faculty> faculties);

    Faculty dtoToEntity(BasicFacultyDto basicFacultyDto);
}
