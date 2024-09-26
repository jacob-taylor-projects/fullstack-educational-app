package com.project.education_app.mappers;

import com.project.education_app.dtos.BasicStudentDto;
import com.project.education_app.dtos.FullStudentDto;
import com.project.education_app.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CredentialMapper.class,ProfileMapper.class,
                                            AttendanceMapper.class,BasicGuardianMapper.class, CourseMapper.class, GradeMapper.class, CourseGradeMapper.class,
                                            PostMapper.class, CommentMapper.class, SubmissionMapper.class, ProjectMapper.class, AssignmentMapper.class,TestMapper.class, ScheduleMapper.class})
public interface FullStudentMapper {
    FullStudentMapper INSTANCE= Mappers.getMapper(FullStudentMapper.class);
    FullStudentDto entityToDto(Student student);

    List<FullStudentDto> entitiesToDtos(List<Student> students);

    Student dtoToEntity(FullStudentDto fullStudentDto);
}
