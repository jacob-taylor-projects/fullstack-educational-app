package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
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
    private Set<Assignment> assignments=new HashSet<>();

    @OneToMany(mappedBy = "syllabus",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<Project> projects=new HashSet<>();

    @OneToMany(mappedBy = "syllabus",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<Test> tests=new HashSet<>();

    private String evaluationCriteria;

    @OneToMany(mappedBy = "syllabus",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<Resource> resources=new HashSet<>();
}
