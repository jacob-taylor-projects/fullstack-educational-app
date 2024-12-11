package com.project.education_app.mappers;

import com.project.education_app.dtos.AssignmentDto;
import com.project.education_app.dtos.AttendanceDto;
import com.project.education_app.entities.Assignment;
import com.project.education_app.entities.Attendance;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface AttendanceMapper {
    AttendanceMapper INSTANCE= Mappers.getMapper(AttendanceMapper.class);
    AttendanceDto entityToDto(Attendance attendance);

    List<AttendanceDto> entitiesToDtos(List<Attendance> attendances);

    Attendance dtoToEntity(AttendanceDto attendanceDto);
}
