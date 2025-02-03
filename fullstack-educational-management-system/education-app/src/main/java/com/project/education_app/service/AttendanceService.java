package com.project.education_app.service;

import com.project.education_app.dtos.AttendanceDto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AttendanceService {

    AttendanceDto createAttendance(AttendanceDto attendanceDto);

    AttendanceDto updateAttendance(Long id, AttendanceDto attendanceDto);

    AttendanceDto getAttendanceById(Long id);

    void deleteAttendance(Long id);

    List<AttendanceDto> findAttendancesByStudent(Long studentId);

    List<AttendanceDto> findAttendancesByCourse(Long courseId);

    List<AttendanceDto> findAttendancesByDate(LocalDate attendanceDate);

    List<AttendanceDto> getAllAttendances();


}
