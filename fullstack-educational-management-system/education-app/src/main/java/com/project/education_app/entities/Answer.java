package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Answer {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @OneToOne
    private Problem problem;

    @OneToMany(mappedBy = "answer")
    private List<Submission> submissions;
}
