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
public class Project {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "project")
    private ProblemAnswer problemAnswer;

    @ManyToOne
    private Faculty teacher;

    @ManyToMany
    @JoinTable(name = "project_student",
    joinColumns = @JoinColumn(name = "project_id"),
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students=new ArrayList<>();

    private Date dueDate;

    private boolean completed;

    @ManyToOne
    private Syllabus syllabus;
}
