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
public class Unit {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(length = 500)
    private String description;

    @OneToMany(mappedBy = "unit",cascade = CascadeType.ALL)
    private List<Lesson> lessons=new ArrayList<>();

    @ManyToOne
    private Course course;
}
