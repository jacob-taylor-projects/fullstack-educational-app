package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Semester {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String year;

    @OneToMany(mappedBy = "semester")
    private List<Schedule> schedules=new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "semester_course",
            joinColumns = @JoinColumn(name = "semester_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses=new ArrayList<>();
}
