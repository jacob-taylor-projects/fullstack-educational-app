package com.project.education_app.dtos;

import com.project.education_app.entities.*;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class GradeDto {
    private Long id;

    private double grade;

    private Timestamp dateGraded;

    private BasicStudentDto student;

    private BasicFacultyDto teacher;

    private CourseDto course;

    private SubmissionDto submission;

    private CourseGradeDto courseGrade;
}
