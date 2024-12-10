package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
public class AttendanceDto {
    private Long id;

    private Date AttendanceDate;

    private boolean present;

    private BasicStudentDto student;

    private CourseDto course;
}
