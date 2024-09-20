package com.project.education_app.dtos;

import com.project.education_app.entities.Course;
import com.project.education_app.entities.Syllabus;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ResourceDto {
    private Long id;

    private String resourceName;

    private String url;

    private SyllabusDto syllabus;

    private CourseDto course;
}
