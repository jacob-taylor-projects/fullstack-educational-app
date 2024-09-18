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
public class Attendance {
    @Id
    @GeneratedValue
    private Long id;

    //Add enrollment

    private Date attendanceDate;

    private boolean present;
}
