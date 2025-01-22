package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
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
