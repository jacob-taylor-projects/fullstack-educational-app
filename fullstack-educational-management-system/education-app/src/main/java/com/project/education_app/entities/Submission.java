package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Submission {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @OneToMany(mappedBy = "submission")
    private List<StudentAnswer> studentAnswers = new ArrayList<>();

    @OneToOne(mappedBy = "submission")
    private Grade grade;

    @ManyToOne(fetch = FetchType.EAGER)
    private Student student;

    @OneToOne(mappedBy = "submission")
    private Feedback feedback;

    @CreatedDate
    private Timestamp submissionDate = Timestamp.valueOf(LocalDateTime.now());

    // Constructors, getters, and setters
}


