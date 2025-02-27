package com.project.education_app.service;

import com.project.education_app.dtos.BasicStudentDto;
import com.project.education_app.dtos.FullStudentDto;

import java.util.List;

public interface StudentService {
    BasicStudentDto save(BasicStudentDto basicStudentDto);

    List<FullStudentDto> findAll();

    FullStudentDto findById(Long id);

    BasicStudentDto update(Long id, BasicStudentDto basicStudentDto);

    void delete(Long id);

    List<FullStudentDto> findByFirstName(String firstName);

    List<FullStudentDto> findByLastName(String lastName);

    List<FullStudentDto> findByEmail(String email);

    List<FullStudentDto> findByPhoneNumber(String phoneNumber);

    List<FullStudentDto> findByUsername(String username);

    List<FullStudentDto> findByAge(int age);

    List<FullStudentDto> findByGender(String gender);

    List<FullStudentDto> findByAddress(String address);

    List<FullStudentDto> findByAgeGreaterThan(int age);

    List<FullStudentDto> findByCoursesId(Long courseId);

    List<FullStudentDto> findByGradesId(Long gradeId);

    List<FullStudentDto> findByCourseGradesId(Long courseGradeId);

    List<FullStudentDto> findByPostsId(Long postId);

    List<FullStudentDto> findByCommentsId(Long commentId);

    List<FullStudentDto> findBySubmissionsId(Long submissionId);

    List<FullStudentDto> findByProjectsId(Long projectId);

    List<FullStudentDto> findByAssignmentsId(Long assignmentId);

    List<FullStudentDto> findByTestsId(Long testId);

    List<FullStudentDto> findBySchedulesId(Long scheduleId);

    FullStudentDto assignAttendances(Long id, List<Long> attendanceIds);

    FullStudentDto assignGuardians(Long id, List<Long> guardianIds);

    FullStudentDto assignCourses(Long id, List<Long> courseIds);

    FullStudentDto assignGrades(Long id, List<Long> gradeIds);

    FullStudentDto assignCourseGrades(Long id, List<Long> courseGradeIds);

    FullStudentDto assignPosts(Long id, List<Long> postIds);

    FullStudentDto assignComments(Long id, List<Long> commentIds);

    FullStudentDto assignSubmissions(Long id, List<Long> submissionIds);

    FullStudentDto assignProjects(Long id, List<Long> projectIds);

    FullStudentDto assignAssignments(Long id, List<Long> assignmentIds);

    FullStudentDto assignTests(Long id, List<Long> testIds);

    FullStudentDto assignSchedules(Long id, List<Long> scheduleIds);
}
