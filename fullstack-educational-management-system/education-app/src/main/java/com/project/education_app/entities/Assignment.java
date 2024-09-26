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
public class Assignment {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany(mappedBy = "assignment",cascade = CascadeType.ALL)
    private List<ProblemAnswer> problemAnswers=new ArrayList<>();


    @ManyToOne
    private Faculty teacher;

    @ManyToMany
    @JoinTable(name = "assignment_student",
            joinColumns = @JoinColumn(name = "assignment_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students=new ArrayList<>();

    private Date dueDate;

    private boolean completed;

    @ManyToOne
    private Syllabus syllabus;
}
