package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class Attendance {
    @Id
    @GeneratedValue
    private Long id;

    private Date attendanceDate;

    private boolean present;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;
}
