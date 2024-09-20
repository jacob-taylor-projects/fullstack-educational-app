package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class AnswerDto {
    private Long id;

    private String content;

    private ProblemDto problem;

    private List<SubmissionDto> submissions;
}
