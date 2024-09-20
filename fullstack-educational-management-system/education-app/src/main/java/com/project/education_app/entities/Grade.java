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
public class Grade {
    @Id
    @GeneratedValue
    private Long id;

    private double grade;

    @CreatedDate
    private Timestamp dateGraded=Timestamp.valueOf(LocalDateTime.now());

    @ManyToOne
    private Student student;

    @ManyToOne
    private Faculty teacher;

    @ManyToOne
    private Course course;

    @OneToOne
    private Submission submission;

    @ManyToOne
    private CourseGrade courseGrade;
}
