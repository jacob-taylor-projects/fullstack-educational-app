package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
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
