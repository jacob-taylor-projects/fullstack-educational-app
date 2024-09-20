package com.project.education_app.dtos;

import com.project.education_app.entities.Faculty;
import com.project.education_app.entities.Problem;
import com.project.education_app.entities.Student;
import com.project.education_app.entities.Syllabus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
public class TestDto {
    private Long id;

    private String title;

    private List<ProblemDto> problems;

    private BasicFacultyDto teacher;

    private List<BasicStudentDto> students;

    private Date dueDate;

    private boolean completed;

    @ManyToOne
    private SyllabusDto syllabus;
}
