package com.project.education_app.dtos;

import com.project.education_app.entities.Course;
import com.project.education_app.entities.Lesson;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class UnitDto {
    private Long id;

    private String name;

    private String description;


    private List<LessonDto> lessons;

    private CourseDto course;
}
