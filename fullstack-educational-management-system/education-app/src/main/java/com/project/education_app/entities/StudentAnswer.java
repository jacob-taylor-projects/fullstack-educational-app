package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class StudentAnswer {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Student student;

    @ManyToOne
    private ProblemAnswer problemAnswer;

    @Column(length = 700)
    private String answerContent;

    @ManyToOne
    private Submission submission; // Reference to Submission

    @CreatedDate
    private Timestamp submissionDate = Timestamp.valueOf(LocalDateTime.now());

}

