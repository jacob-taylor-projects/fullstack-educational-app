package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class Announcement {
    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    private Timestamp date=Timestamp.valueOf(LocalDateTime.now());

    private String title;

    private String message;

    private boolean deleted;

    @Enumerated(EnumType.STRING)
    private AudienceType audienceType;

    @ManyToOne
    private Faculty author;

    @ManyToOne
    private Course course;

    public enum AudienceType{
        ALL_STUDENTS,
        ALL_FACULTY,
        ALL_GUARDIANS,
        COURSE_STUDENTS,
        COURSE_FACULTY,
        COURSE_GUARDIANS
    }
}
