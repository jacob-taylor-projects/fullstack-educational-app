package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class AttendanceDto {
    private CourseDto course;

    private List<AttendanceItemDto> attendanceItems;
}
