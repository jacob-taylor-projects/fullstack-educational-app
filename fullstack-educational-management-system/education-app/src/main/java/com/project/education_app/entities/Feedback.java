package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
