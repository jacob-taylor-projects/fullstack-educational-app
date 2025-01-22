package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Announcement {
    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    private Timestamp date=Timestamp.valueOf(LocalDateTime.now());

    private String title;

    private String message;


    @ManyToOne
    private Faculty author;


}
