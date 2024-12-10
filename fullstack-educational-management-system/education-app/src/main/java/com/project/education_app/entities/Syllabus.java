package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class Syllabus {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "syllabus")
    private Course course;

    private String objectives;

    private String topics;

    @OneToMany(mappedBy = "syllabus",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Assignment> assignments = new ArrayList<>();

    @OneToMany(mappedBy = "syllabus",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Project> projects = new ArrayList<>();

    @OneToMany(mappedBy = "syllabus",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Test> tests = new ArrayList<>();

    private String evaluationCriteria;

    @OneToMany(mappedBy = "syllabus",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Resource> resources = new ArrayList<>();
}
