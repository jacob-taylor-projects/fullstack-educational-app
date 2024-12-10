package com.project.education_app.dtos;

import com.project.education_app.entities.*;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Data
public class FullStudentDto {
    private Long id;

    private CredentialDto credentials;

    private ProfileDto profile;

    private int age;

    private String gender;

    private String address;

    private List<AttendanceDto> attendances;

    private List<BasicGuardianDto> guardians;

    private List<CourseDto> courses;

    private List<GradeDto> grades;

    private List<CourseGradeDto> courseGrades;

    private List<PostDto> posts;

    private List<CommentDto> comments;

    private List<SubmissionDto> submissions;

    private List<ProjectDto> projects;

    private List<AssignmentDto> assignments;

    private List<TestDto> tests;

    private List<ScheduleDto> schedules;
}
