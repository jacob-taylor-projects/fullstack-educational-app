package com.project.education_app.mappers;

import com.project.education_app.entities.Attendance;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { BasicStudentMapper.class})
public interface AttendanceItemMapper {
    AttendanceItemMapper INSTANCE= Mappers.getMapper(AttendanceItemMapper.class);
    AttendanceItemDto entityToDto(Attendance attendance);

    List<AttendanceItemDto> entitiesToDtos(List<Attendance> attendances);

    Attendance dtoToEntity(AttendanceItemDto attendanceItemDto);
}
