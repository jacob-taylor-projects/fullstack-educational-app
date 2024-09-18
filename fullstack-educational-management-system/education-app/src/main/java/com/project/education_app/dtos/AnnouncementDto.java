package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class AnnouncementDto {
    private Long id;

    private Timestamp date;

    private String title;

    private String message;

    private boolean deleted;

    private String audienceType;

    private BasicFacultyDTO author;
}
