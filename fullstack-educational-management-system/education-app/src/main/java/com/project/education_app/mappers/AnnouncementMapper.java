package com.project.education_app.mappers;

import com.project.education_app.dtos.AnnouncementDto;
import com.project.education_app.entities.Announcement;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(componentModel = "spring", uses = { BasicFacultyMapper.class })
public interface AnnouncementMapper {
    AnnouncementMapper INSTANCE= Mappers.getMapper(AnnouncementMapper.class);
    AnnouncementDto entityToDto(Announcement announcement);

    List<AnnouncementDto> entitiesToDtos(List<Announcement> announcements);

    Announcement dtoToEntity(AnnouncementDto announcementsDto);
}
