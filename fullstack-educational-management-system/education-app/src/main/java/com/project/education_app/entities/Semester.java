package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Semester {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String year;
}
