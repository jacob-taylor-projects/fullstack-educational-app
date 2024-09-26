package com.project.education_app.mappers;

import com.project.education_app.dtos.TestDto;
import com.project.education_app.dtos.UnitDto;
import com.project.education_app.entities.Test;
import com.project.education_app.entities.Unit;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProblemAnswerMapper.class, BasicFacultyMapper.class, BasicStudentMapper.class,SyllabusMapper.class})
public interface TestMapper {
    TestMapper INSTANCE= Mappers.getMapper(TestMapper.class);
    TestDto entityToDto(Test test);

    List<TestDto> entitiesToDtos(List<Test> tests);

    Test dtoToEntity(TestDto testDto);
}
