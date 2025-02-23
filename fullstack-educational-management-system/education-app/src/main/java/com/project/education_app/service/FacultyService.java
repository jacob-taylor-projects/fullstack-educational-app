package com.project.education_app.service;

import com.project.education_app.dtos.BasicFacultyDto;
import com.project.education_app.dtos.FullFacultyDto;
import com.project.education_app.repos.FacultyRepo;

import java.util.List;

public interface FacultyService {
    BasicFacultyDto save(BasicFacultyDto basicFacultyDto);

    List<FullFacultyDto> findAll();

    FullFacultyDto findById(Long id);

    BasicFacultyDto update(Long id, BasicFacultyDto basicFacultyDto);

    void delete(Long id);

    List<FullFacultyDto> findByAge(int age);

    List<FullFacultyDto> findByGender(String gender);

    List<FullFacultyDto> findByLastName(String lastName);

    List<FullFacultyDto> findByUsername(String username);

    List<FullFacultyDto> findBySalary(double salary);

    List<FullFacultyDto> findByAdmin(boolean admin);

    List<FullFacultyDto> findByTeacher(boolean teacher);

    List<FullFacultyDto> findByAnnouncementId(Long announcementId);

    List<FullFacultyDto> findByGradeId(Long gradeId);

    List<FullFacultyDto> findByLessonId(Long lessonId);

    List<FullFacultyDto> findByDiscussionId(Long discussionId);

    List<FullFacultyDto> findByProjectId(Long projectId);

    List<FullFacultyDto> findByAssignmentId(Long assignmentId);

    List<FullFacultyDto> findByTestId(Long testId);

    FullFacultyDto assignAnnouncements(Long id, List<Long> announcementIds);

    FullFacultyDto assignGrades(Long id, List<Long> gradeIds);

    FullFacultyDto assignLessons(Long id, List<Long> lessonIds);

    FullFacultyDto assignDiscussions(Long id, List<Long> discussionIds);

    FullFacultyDto assignProjects(Long id, List<Long> projectIds);

    FullFacultyDto assignAssignments(Long id, List<Long> assignmentIds);

    FullFacultyDto assignTests(Long id, List<Long> testIds);
}
