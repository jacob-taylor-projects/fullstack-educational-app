package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Data
public class CourseDto {
    private Long id;

    private String name;

    private String description;

    private String subject;

    private int credits;

    private Set<AnnouncementDto> announcements;

    private SyllabusDto syllabus;

    private Set<AttendanceDto> attendances;

    private Set<BasicStudentDto> students;

    private Set<GradeDto> grades;

    private Set<ResourceDto> resources;

    private List<UnitDto> units;

    private List<ScheduleDto> schedules;

    private List<SemesterDto> semesters;
}
