package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class ProblemAnswer {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 700)
    private String problemContent;

    @Column(length = 700)
    private String answerContent;

    @OneToMany(mappedBy = "problemAnswer", cascade = CascadeType.ALL)
    private List<StudentAnswer> studentAnswers = new ArrayList<>();

    @OneToOne
    private Project project;

    @ManyToOne
    private Assignment assignment;

    @ManyToOne
    private Test test;

    // Constructors, getters, and setters
    public void addStudentAnswer(StudentAnswer studentAnswer) {
        studentAnswers.add(studentAnswer);
        studentAnswer.setProblemAnswer(this);
    }
}
