package com.project.education_app.repos;

import com.project.education_app.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    List<Student> findByCredentialsUsername(String username);

    List<Student> findByProfileLastName(String lastName);

    List<Student> findByAge(int age);

    List<Student> findByAgeGreaterThan(int age);

    List<Student> findByGenderContaining(String gender);

    List<Student> findByCoursesId(Long courseId);

    List<Student> findByGradesId(Long gradeId);

    List<Student> findByCourseGradesId(Long courseGradeId);

    List<Student> findByPostsId(Long postId);

    List<Student> findByCommentsId(Long commentId);

    List<Student> findBySubmissionsId(Long submissionId);

    List<Student> findByProjectsId(Long projectId);

    List<Student> findByAssignmentsId(Long assignmentId);

    List<Student> findByTestsId(Long testId);

    List<Student> findBySchedulesId(Long scheduleId);
}
