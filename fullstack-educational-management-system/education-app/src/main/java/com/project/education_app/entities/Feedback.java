package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;

    private String feedbackText;

    @OneToOne
    private Submission submission;

    @CreatedDate
    private Timestamp feedbackDate=Timestamp.valueOf(LocalDateTime.now());
}
