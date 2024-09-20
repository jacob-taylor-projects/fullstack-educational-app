package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class FeedbackDto {
    private Long id;

    private String feedbackText;

    private SubmissionDto submission;

    private Timestamp feedbackDate;
}
