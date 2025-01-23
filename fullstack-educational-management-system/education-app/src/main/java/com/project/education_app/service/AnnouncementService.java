package com.project.education_app.service;

import com.project.education_app.dtos.AnnouncementDto;
import com.project.education_app.entities.Announcement;
import com.project.education_app.entities.Faculty;

import java.util.List;

public interface AnnouncementService {
    List<AnnouncementDto> getAllAnnouncements();

    AnnouncementDto getAnnouncementById(Long id);

    List<AnnouncementDto> getAnnouncementsByTitle(String title);

    List<AnnouncementDto> getAnnouncementsByMessage(String message);

    List<AnnouncementDto> getAnnouncementsByAuthorId(Long authorId);

    AnnouncementDto createAnnouncement(AnnouncementDto announcementDto);

    AnnouncementDto patchAnnouncement(Long id, AnnouncementDto announcementDto);

    void deleteAnnouncement(Long id);
}
