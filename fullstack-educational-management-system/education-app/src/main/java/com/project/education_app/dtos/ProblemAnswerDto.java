package com.project.education_app.dtos;

import com.project.education_app.entities.Assignment;
import com.project.education_app.entities.Project;
import com.project.education_app.entities.Submission;
import com.project.education_app.entities.Test;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ProblemAnswerDto {
    private Long id;
    private String problemContent;
    private String answerContent;
    // Updated to match the new structure

    // Constructors, getters, and setters
}

