package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Schedule {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    private Student student;

    @ManyToMany
    @JoinTable(name = "schedule_course",
    joinColumns = @JoinColumn(name = "schedule_id"),
    inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses=new ArrayList<>();

    @ManyToOne
    private Semester semester;
}
