package com.project.education_app.dtos;

import com.project.education_app.entities.Answer;
import com.project.education_app.entities.Feedback;
import com.project.education_app.entities.Grade;
import com.project.education_app.entities.Student;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class SubmissionDto {
    private Long id;

    private String content;

    private AnswerDto answer;

    private GradeDto grade;

    @ManyToOne
    private BasicStudentDto student;

    private FeedbackDto feedback;

    @CreatedDate
    private Timestamp submissionDate;
}
