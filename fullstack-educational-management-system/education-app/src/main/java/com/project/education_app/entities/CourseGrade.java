package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CourseGrade {
    @Id
    @GeneratedValue
    private Long id;

    private double overallGrade;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    @OneToMany(mappedBy = "courseGrade")
    private List<Grade> grades;
}
