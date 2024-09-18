package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Unit {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "unit",cascade = CascadeType.ALL)
    private List<Lesson> lessons=new ArrayList<>();

    @ManyToOne
    private Course course;
}
