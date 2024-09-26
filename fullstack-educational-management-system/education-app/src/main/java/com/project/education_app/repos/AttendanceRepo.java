package com.project.education_app.repos;

import com.project.education_app.dtos.BasicStudentDto;
import com.project.education_app.dtos.CourseDto;
import com.project.education_app.entities.Attendance;
import com.project.education_app.entities.Course;
import com.project.education_app.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance,Long> {
    List<Attendance> findByCourseId(Long courseId);

    List<Attendance> findByStudentId(Long studentId);

    List<Attendance> findByAttendanceDate(Date attendanceDate);
}
