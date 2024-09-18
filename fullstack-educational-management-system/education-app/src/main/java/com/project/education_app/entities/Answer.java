package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Answer {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @OneToOne
    private Project project;

    @ManyToOne
    private Assignment assignment;

    @ManyToOne
    private Test test;
}
