package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Test {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany(mappedBy = "test",cascade = CascadeType.ALL)
    private List<ProblemAnswer> problemAnswers=new ArrayList<>();


    @ManyToOne
    private Faculty teacher;

    @ManyToMany
    @JoinTable(name = "test_student",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students=new ArrayList<>();

    private Date dueDate;

    private boolean completed;

    @ManyToOne
    private Syllabus syllabus;
}
