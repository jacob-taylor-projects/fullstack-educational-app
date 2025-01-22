package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Grade {
    @Id
    @GeneratedValue
    private Long id;

    private double grade;

    @CreatedDate
    private Timestamp dateGraded=Timestamp.valueOf(LocalDateTime.now());

    @ManyToOne(fetch = FetchType.EAGER)
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    private Faculty teacher;

    @ManyToOne(fetch = FetchType.EAGER)
    private Course course;

    @OneToOne
    private Submission submission;

    @ManyToOne
    private CourseGrade courseGrade;
}
