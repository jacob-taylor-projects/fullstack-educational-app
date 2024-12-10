package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class StudentAnswer {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Student student;

    @OneToOne
    private ProblemAnswer problemAnswer;

    private String answerContent;

    @ManyToOne
    private Submission submission; // Reference to Submission

    @CreatedDate
    private Timestamp submissionDate = Timestamp.valueOf(LocalDateTime.now());

}

