package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Resource {
    @Id
    @GeneratedValue
    private Long id;

    private String resourceName;

    private String url;

    @ManyToOne
    private Syllabus syllabus;

    @ManyToOne
    private Course course;
}
