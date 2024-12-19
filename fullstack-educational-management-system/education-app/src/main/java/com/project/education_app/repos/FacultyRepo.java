package com.project.education_app.repos;

import com.project.education_app.entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FacultyRepo extends JpaRepository<Faculty,Long> {

    Faculty findById(long id);

    List<Faculty> findByAge(int age);

    List<Faculty> findByGender(String gender);

    Faculty findByProfileLastName(String lastName);

    List<Faculty> findByCredentialsUsername(String username);

    List<Faculty> findBySalary(double salary);

    List<Faculty> findByAdmin(boolean admin);

    List<Faculty> findByTeacher(boolean teacher);

    List<Faculty> findByAnnouncementsId(Long announcementId);

    List<Faculty> findByGradesId(Long gradeId);

    List<Faculty> findByLessonsId(Long lessonId);

    List<Faculty> findByDiscussionsId(Long discussionId);

    List<Faculty> findByProjectsId(Long projectId);

    List<Faculty> findByAssignmentsId(Long assignmentId);

    List<Faculty> findByTestsId(Long testId);
}
