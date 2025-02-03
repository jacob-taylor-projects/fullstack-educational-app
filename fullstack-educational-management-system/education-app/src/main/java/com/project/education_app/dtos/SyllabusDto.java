package com.project.education_app.dtos;

import com.project.education_app.entities.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Data
public class SyllabusDto {
    private Long id;

    private String objectives;

    private String topics;

    private List<AssignmentDto> assignments;

    private List<ProjectDto> projects;

    private List<TestDto> tests;

    private String evaluationCriteria;

    private List<ResourceDto> resources;
}
