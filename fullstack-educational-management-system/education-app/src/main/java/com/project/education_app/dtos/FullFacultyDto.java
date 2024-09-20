package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Data
public class FullFacultyDto {
    private Long id;

    private CredentialDto credentials;

    private ProfileDto profile;

    private int age;

    private String gender;

    private String address;

    private double salary;

    private boolean admin;

    private boolean teacher;

    private Set<AnnouncementDto> announcements;

    private List<GradeDto> grades;

    private List<LessonDto> lessons;

    private List<DiscussionDto> discussions;

    private List<ProjectDto> projects;

    private List<AssignmentDto> assignments;

    private List<TestDto> tests;
}
