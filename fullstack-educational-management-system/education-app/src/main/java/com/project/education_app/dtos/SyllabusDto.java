package com.project.education_app.dtos;

import com.project.education_app.entities.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
public class SyllabusDto {
    private Long id;

    private CourseDto course;

    private String objectives;

    private String topics;

    private Set<AssignmentDto> assignments;

    private Set<ProjectDto> projects;

    private Set<TestDto> tests;

    private String evaluationCriteria;

    private Set<ResourceDto> resources;
}
