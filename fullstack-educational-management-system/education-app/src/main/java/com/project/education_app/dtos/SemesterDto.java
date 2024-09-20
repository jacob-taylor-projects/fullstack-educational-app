package com.project.education_app.dtos;

import com.project.education_app.entities.Course;
import com.project.education_app.entities.Schedule;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class SemesterDto {
    private Long id;

    private String name;

    private String year;

    private List<ScheduleDto> schedules;

    private List<CourseDto> courses;
}
