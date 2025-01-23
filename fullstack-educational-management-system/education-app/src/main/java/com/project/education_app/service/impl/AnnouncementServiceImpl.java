package com.project.education_app.service.impl;

import com.project.education_app.dtos.AnnouncementDto;
import com.project.education_app.entities.Announcement;
import com.project.education_app.entities.Faculty;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.AnnouncementMapper;
import com.project.education_app.mappers.BasicFacultyMapper;
import com.project.education_app.repos.AnnouncementRepo;
import com.project.education_app.repos.FacultyRepo;
import com.project.education_app.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnnouncementServiceImpl implements AnnouncementService {

    private final AnnouncementMapper announcementMapper;
    private final AnnouncementRepo announcementRepo;
    private final BasicFacultyMapper basicFacultyMapper;
    private final FacultyRepo facultyRepo;


    @Override
    public List<AnnouncementDto> getAllAnnouncements() {
        List<Announcement> sortedList = new ArrayList<>(announcementRepo.findAll());
        sortedList.sort(Comparator.comparing(Announcement::getDate).reversed());
        return announcementMapper.entitiesToDtos(sortedList);
    }

    @Override
    public AnnouncementDto getAnnouncementById(Long id) {
        Announcement announcement = announcementRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Announcement not found with id: " + id));
        return announcementMapper.entityToDto(announcement);
    }

    @Override
    public List<AnnouncementDto> getAnnouncementsByTitle(String title) {
        List<Announcement> announcements = announcementRepo.findByTitleContaining(title);
        if (announcements.isEmpty()) {
            throw new NotFoundException("No announcements found with title: " + title);
        }
        return announcementMapper.entitiesToDtos(announcements);
    }

    @Override
    public List<AnnouncementDto> getAnnouncementsByMessage(String message) {
        List<Announcement> announcements = announcementRepo.findByMessageContaining(message);
        if (announcements.isEmpty()) {
            throw new NotFoundException("No announcements found with message: " + message);
        }
        return announcementMapper.entitiesToDtos(announcements);
    }

    @Override
    public List<AnnouncementDto> getAnnouncementsByAuthorId(Long authorId) {
        Faculty author = facultyRepo.findById(authorId)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id: " + authorId));
        List<Announcement> announcements = announcementRepo.findByAuthorId(authorId);
        if (announcements.isEmpty()) {
            throw new NotFoundException("No announcements found by author with id: " + authorId);
        }
        return announcementMapper.entitiesToDtos(announcements);
    }

    @Override
    public AnnouncementDto createAnnouncement(AnnouncementDto announcementDto) {
        Faculty author = facultyRepo.findById(announcementDto.getAuthor().getId())
                .orElseThrow(() -> new NotFoundException("Faculty not found with id: " + announcementDto.getAuthor().getId()));
        Announcement announcement = announcementMapper.dtoToEntity(announcementDto);
        announcement.setDate(Timestamp.valueOf(LocalDateTime.now()));
        announcement.setAuthor(author);
        Announcement savedAnnouncement = announcementRepo.save(announcement);
        AnnouncementDto savedAnnouncementDto = announcementMapper.entityToDto(savedAnnouncement);
        // Use BasicFacultyMapper to convert author
        savedAnnouncementDto.setAuthor(basicFacultyMapper.entityToDto(savedAnnouncement.getAuthor()));
        return savedAnnouncementDto;
    }

    @Override
    public AnnouncementDto patchAnnouncement(Long id, AnnouncementDto announcementDto) {
        Announcement announcement = announcementRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Announcement not found with id: " + id));

        if (announcementDto.getTitle() != null) {
            announcement.setTitle(announcementDto.getTitle());
        }
        if (announcementDto.getDate() != null) {
            announcement.setDate(Timestamp.from(Instant.now()));  // Assuming you want to update the date to the current timestamp
        }
        if (announcementDto.getMessage() != null) {
            announcement.setMessage(announcementDto.getMessage());
        }
        if (announcementDto.getAuthor() != null) {
            Faculty author = facultyRepo.findById(announcementDto.getAuthor().getId())
                    .orElseThrow(() -> new NotFoundException("Faculty not found with id: " + announcementDto.getAuthor().getId()));
            announcement.setAuthor(author);
        }

        Announcement updatedAnnouncement = announcementRepo.saveAndFlush(announcement);
        AnnouncementDto updatedAnnouncementDto = announcementMapper.entityToDto(updatedAnnouncement);
        updatedAnnouncementDto.setAuthor(basicFacultyMapper.entityToDto(updatedAnnouncement.getAuthor()));
        return updatedAnnouncementDto;
    }

    @Override
    public void deleteAnnouncement(Long id) {
        if (!announcementRepo.existsById(id)) {
            throw new NotFoundException("Announcement not found with id: " + id);
        }
        announcementRepo.deleteById(id);
    }
}
