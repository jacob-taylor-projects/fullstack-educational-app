package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class StudentAnswerDto {
    private Long id;
    private BasicStudentDto student; // Updated to include the DTO instead of ID
    private ProblemAnswerDto problemAnswer; // Updated to include the DTO instead of ID
    private String answerContent;
    private Timestamp submissionDate;
    // Updated to include the DTO instead of ID

    // Constructors, getters, and setters
}

