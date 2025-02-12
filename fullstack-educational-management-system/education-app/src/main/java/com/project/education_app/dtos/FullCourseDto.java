package com.project.education_app.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class FullCourseDto {
    private Long id;

    private String name;

    private String description;

    private String subject;

    private int credits;

    private SyllabusDto syllabus;

    private List<AttendanceDto> attendances;

    private List<BasicStudentDto> students;

    private List<GradeDto> grades;

    private List<CourseGradeDto> courseGrades;

    private List<ResourceDto> resources;

    private List<UnitDto> units;

    private List<ScheduleDto> schedules;

    private List<SemesterDto> semesters;
}
