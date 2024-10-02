package com.project.education_app.dtos;

import com.project.education_app.entities.Announcement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@NoArgsConstructor
@Data
public class AnnouncementDto {
    private Long id;

    private Timestamp date;

    private String title;

    private String message;


    private BasicFacultyDto author;

}
