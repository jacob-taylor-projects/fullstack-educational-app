package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Submission {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @OneToMany(mappedBy = "submission", cascade = CascadeType.ALL)
    private List<StudentAnswer> studentAnswers = new ArrayList<>();

    @OneToOne(mappedBy = "submission")
    private Grade grade;

    @ManyToOne
    private Student student;

    @OneToOne(mappedBy = "submission")
    private Feedback feedback;

    @CreatedDate
    private Timestamp submissionDate = Timestamp.valueOf(LocalDateTime.now());

    // Constructors, getters, and setters
}


