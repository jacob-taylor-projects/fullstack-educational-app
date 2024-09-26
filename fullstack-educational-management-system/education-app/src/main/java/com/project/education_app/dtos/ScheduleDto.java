package com.project.education_app.dtos;

import com.project.education_app.entities.Course;
import com.project.education_app.entities.Semester;
import com.project.education_app.entities.Student;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class ScheduleDto {
    private Long id;

    private String name;

    private String description;

    private BasicStudentDto student;

    private List<CourseDto> courses;

    private SemesterDto semester;
}
