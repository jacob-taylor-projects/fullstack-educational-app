package com.project.education_app.dtos;

import com.project.education_app.entities.Course;
import com.project.education_app.entities.Grade;
import com.project.education_app.entities.Student;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class CourseGradeDto {
    private Long id;

    private double overallGrade;

    private BasicStudentDto student;

    private CourseDto course;

    private List<GradeDto> grades;
}
