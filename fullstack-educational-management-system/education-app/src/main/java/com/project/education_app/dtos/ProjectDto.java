package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
public class ProjectDto {
    private Long id;

    private String name;

    private ProblemAnswerDto problemAnswer;

    private BasicFacultyDto teacher;

    private List<BasicStudentDto> students;

    private Date dueDate;

    private boolean completed;

}
