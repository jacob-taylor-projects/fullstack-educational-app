package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class AttendanceItemDto {
    private Long id;

    private BasicStudentDto student;

    private boolean present;

    private Date date;
}
