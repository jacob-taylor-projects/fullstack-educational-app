package com.project.education_app.dtos;

import com.project.education_app.entities.Answer;
import com.project.education_app.entities.Assignment;
import com.project.education_app.entities.Project;
import com.project.education_app.entities.Test;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProblemDto {
    private Long id;

    private String name;

    private String description;

    private AnswerDto answer;

    private ProjectDto project;

    private AssignmentDto assignment;

    private TestDto test;
}
