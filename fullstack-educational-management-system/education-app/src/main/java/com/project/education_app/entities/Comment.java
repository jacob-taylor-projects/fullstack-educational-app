package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @CreatedDate
    private Timestamp date=Timestamp.valueOf(LocalDateTime.now());

    @ManyToOne
    private Post post;

    @ManyToOne
    private Student student;
}
