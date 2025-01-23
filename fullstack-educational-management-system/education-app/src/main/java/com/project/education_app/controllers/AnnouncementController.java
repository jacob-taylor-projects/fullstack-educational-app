package com.project.education_app.controllers;

import com.project.education_app.dtos.AnnouncementDto;
import com.project.education_app.entities.Announcement;
import com.project.education_app.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/announcements")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;


    @GetMapping
    public List<AnnouncementDto> getAllAnnouncements() {
        return announcementService.getAllAnnouncements();
    }

    @GetMapping("/{id}")
    public AnnouncementDto getAnnouncementById(@PathVariable Long id) {
        return announcementService.getAnnouncementById(id);
    }

    @GetMapping("/title/{title}")
    public List<AnnouncementDto> getAnnouncementsByTitle(@PathVariable String title) {
        return announcementService.getAnnouncementsByTitle(title);
    }

    @GetMapping("/message/{message}")
    public List<AnnouncementDto> getAnnouncementsByMessage(@PathVariable String message) {
        return announcementService.getAnnouncementsByMessage(message);
    }

    @GetMapping("/author/{authorId}")
    public List<AnnouncementDto> getAnnouncementsByAuthorId(@PathVariable Long authorId) {
        return announcementService.getAnnouncementsByAuthorId(authorId);
    }

    @PostMapping
    public AnnouncementDto createAnnouncement(@RequestBody AnnouncementDto announcementDto) {
        return announcementService.createAnnouncement(announcementDto);
    }

    @PatchMapping("/{id}")
    public AnnouncementDto patchAnnouncement(@PathVariable Long id, @RequestBody AnnouncementDto announcementDto) {
        return announcementService.patchAnnouncement(id, announcementDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteAnnouncement(@PathVariable Long id) {
        announcementService.deleteAnnouncement(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
