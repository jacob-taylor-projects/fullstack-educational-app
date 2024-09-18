package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class Enrollment {
    @Id
    @GeneratedValue
    private Long id;

    //Add Course and student

    private Date enrollmentDate;

    private Date completionDate;
}
