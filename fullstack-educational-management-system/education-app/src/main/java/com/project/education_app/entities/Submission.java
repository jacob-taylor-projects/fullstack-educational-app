package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class Submission {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @ManyToOne
    private Answer answer;

    @OneToOne(mappedBy = "submission")
    private Grade grade;

    @ManyToOne
    private Student student;

    @OneToOne(mappedBy = "submission")
    private Feedback feedback;

    @CreatedDate
    private Timestamp submissionDate=Timestamp.valueOf(LocalDateTime.now());
}
