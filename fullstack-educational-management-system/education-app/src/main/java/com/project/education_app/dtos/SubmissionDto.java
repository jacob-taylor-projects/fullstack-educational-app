package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class SubmissionDto {
    private Long id;

    private String content;

    private ProblemAnswerDto problemAnswer;

    private GradeDto grade;

    private BasicStudentDto student;

    private FeedbackDto feedback;

    private Timestamp submissionDate;
}
