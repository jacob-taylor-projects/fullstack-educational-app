package com.project.education_app.repos;

import com.project.education_app.entities.StudentAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface StudentAnswerRepo extends JpaRepository<StudentAnswer, Long> {
    List<StudentAnswer> findByAnswerContentContaining(String answerContent);

    List<StudentAnswer> findByStudentId(Long studentId);

    List<StudentAnswer> findByProblemAnswerId(Long problemAnswerId);

    List<StudentAnswer> findBySubmissionId(Long submissionId);

    List<StudentAnswer> findBySubmissionDateBetween(Timestamp startDate, Timestamp endDate);
}

