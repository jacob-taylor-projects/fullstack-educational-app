package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class ProblemAnswer {
    @Id
    @GeneratedValue
    private Long id;

    private String problemContent;

    private String answerContent;

    @OneToOne
    private Project project;

    @ManyToOne
    private Assignment assignment;

    @ManyToOne
    private Test test;

    @OneToMany(mappedBy = "problemAnswer")
    private List<Submission> submissions;
}
