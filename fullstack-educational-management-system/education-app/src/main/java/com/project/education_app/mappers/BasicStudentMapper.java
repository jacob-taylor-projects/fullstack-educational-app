package com.project.education_app.mappers;

import com.project.education_app.dtos.BasicGuardianDto;
import com.project.education_app.dtos.BasicStudentDto;
import com.project.education_app.entities.Guardian;
import com.project.education_app.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CredentialMapper.class,ProfileMapper.class})
public interface BasicStudentMapper {
    BasicStudentMapper INSTANCE= Mappers.getMapper(BasicStudentMapper.class);
    BasicStudentDto entityToDto(Student student);

    List<BasicStudentDto> entitiesToDtos(List<Student> students);

    Student dtoToEntity(BasicStudentDto basicStudentDto);
}
