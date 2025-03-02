package com.project.education_app.dtos;

import com.project.education_app.entities.CourseGrade;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Data
public class CourseDto {
    private Long id;

    private String name;

    private String description;

    private String subject;

    private int credits;

    private SyllabusDto syllabus;

    private List<UnitDto> units;

}
