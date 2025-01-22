package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Column(length = 700)
    private String content;

    @ManyToOne
    private Faculty author;

    @ManyToOne
    private Unit unit;
}
