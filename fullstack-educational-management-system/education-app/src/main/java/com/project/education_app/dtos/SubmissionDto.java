package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Data
public class SubmissionDto {
    private Long id;
    private String content;
    private List<StudentAnswerDto> studentAnswers; // Updated to include the DTOs instead of IDs
    private GradeDto grade;
    private BasicStudentDto student; // Updated to include the DTO instead of ID
    private FeedbackDto feedback;
    private Timestamp submissionDate;

    // Constructors, getters, and setters
}

