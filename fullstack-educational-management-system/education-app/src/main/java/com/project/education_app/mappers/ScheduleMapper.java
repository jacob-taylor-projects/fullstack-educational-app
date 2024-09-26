package com.project.education_app.mappers;

import com.project.education_app.dtos.ScheduleDto;
import com.project.education_app.dtos.SemesterDto;
import com.project.education_app.entities.Schedule;
import com.project.education_app.entities.Semester;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = {BasicStudentMapper.class,  SemesterMapper.class})
public interface ScheduleMapper {
    ScheduleMapper INSTANCE= Mappers.getMapper(ScheduleMapper.class);
    ScheduleDto entityToDto(Schedule schedule);

    List<ScheduleDto> entitiesToDtos(List<Schedule> schedules);

    Schedule dtoToEntity(ScheduleDto scheduleDto);
}
