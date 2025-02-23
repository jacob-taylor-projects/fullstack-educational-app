package com.project.education_app.service.impl;

import com.project.education_app.dtos.GradeDto;
import com.project.education_app.entities.*;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.GradeMapper;
import com.project.education_app.repos.*;
import com.project.education_app.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GradeServiceImpl implements GradeService {
    private final GradeRepo gradeRepo;
    private final StudentRepo studentRepo;
    private final FacultyRepo facultyRepo;
    private final CourseRepo courseRepo;
    private final SubmissionRepo submissionRepo;
    private final CourseGradeRepo courseGradeRepo;
    private final GradeMapper gradeMapper;


    @Override
    public GradeDto save(GradeDto gradeDto) {
        Student student = studentRepo.findById(gradeDto.getStudent().getId())
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + gradeDto.getStudent().getId()));
        Faculty teacher = facultyRepo.findById(gradeDto.getTeacher().getId())
                .orElseThrow(() -> new NotFoundException("Teacher not found with id: " + gradeDto.getTeacher().getId()));
        Course course = courseRepo.findById(gradeDto.getCourse().getId())
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + gradeDto.getCourse().getId()));
        Submission submission = submissionRepo.findById(gradeDto.getSubmission().getId())
                .orElseThrow(() -> new NotFoundException("Submission not found with id: " + gradeDto.getSubmission().getId()));
        CourseGrade courseGrade = courseGradeRepo.findById(gradeDto.getCourseGrade().getId())
                .orElseThrow(() -> new NotFoundException("CourseGrade not found with id: " + gradeDto.getCourseGrade().getId()));

        Grade grade = gradeMapper.dtoToEntity(gradeDto);
        grade.setStudent(student);
        grade.setTeacher(teacher);
        grade.setCourse(course);
        grade.setSubmission(submission);
        grade.setCourseGrade(courseGrade);

        Grade savedGrade = gradeRepo.save(grade);
        return gradeMapper.entityToDto(savedGrade);
    }

    @Override
    public List<GradeDto> findAll() {
        List<Grade> grades = gradeRepo.findAll();
        return grades.stream().map(gradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public GradeDto findById(Long id) {
        Grade grade = gradeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Grade not found with id: " + id));
        return gradeMapper.entityToDto(grade);
    }

    @Override
    public GradeDto update(Long id, GradeDto gradeDto) {
        Grade grade = gradeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Grade not found with id: " + id));

        if (gradeDto.getGrade() != 0) {
            grade.setGrade(gradeDto.getGrade());
        }
        if (gradeDto.getDateGraded() != null) {
            grade.setDateGraded(gradeDto.getDateGraded());
        }
        if (gradeDto.getStudent() != null) {
            Student student = studentRepo.findById(gradeDto.getStudent().getId())
                    .orElseThrow(() -> new NotFoundException("Student not found with id: " + gradeDto.getStudent().getId()));
            grade.setStudent(student);
        }
        if (gradeDto.getTeacher() != null) {
            Faculty teacher = facultyRepo.findById(gradeDto.getTeacher().getId())
                    .orElseThrow(() -> new NotFoundException("Teacher not found with id: " + gradeDto.getTeacher().getId()));
            grade.setTeacher(teacher);
        }
        if (gradeDto.getCourse() != null) {
            Course course = courseRepo.findById(gradeDto.getCourse().getId())
                    .orElseThrow(() -> new NotFoundException("Course not found with id: " + gradeDto.getCourse().getId()));
            grade.setCourse(course);
        }
        if (gradeDto.getSubmission() != null) {
            Submission submission = submissionRepo.findById(gradeDto.getSubmission().getId())
                    .orElseThrow(() -> new NotFoundException("Submission not found with id: " + gradeDto.getSubmission().getId()));
            grade.setSubmission(submission);
        }
        if (gradeDto.getCourseGrade() != null) {
            CourseGrade courseGrade = courseGradeRepo.findById(gradeDto.getCourseGrade().getId())
                    .orElseThrow(() -> new NotFoundException("CourseGrade not found with id: " + gradeDto.getCourseGrade().getId()));
            grade.setCourseGrade(courseGrade);
        }

        Grade updatedGrade = gradeRepo.save(grade);
        return gradeMapper.entityToDto(updatedGrade);
    }

    @Override
    public void delete(Long id) {
        Grade grade = gradeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Grade not found with id: " + id));
        gradeRepo.delete(grade);
    }

    @Override
    public List<GradeDto> findByGrade(double gradeValue) {
        List<Grade> grades = gradeRepo.findByGrade(gradeValue);
        return grades.stream().map(gradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<GradeDto> findByGradeGreaterThan(double gradeValue) {
        List<Grade> grades = gradeRepo.findByGradeGreaterThan(gradeValue);
        return grades.stream().map(gradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<GradeDto> findByStudent(Long studentId) {
        List<Grade> grades = gradeRepo.findByStudentId(studentId);
        return grades.stream().map(gradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<GradeDto> findByTeacher(Long teacherId) {
        List<Grade> grades = gradeRepo.findByTeacherId(teacherId);
        return grades.stream().map(gradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<GradeDto> findByCourse(Long courseId) {
        List<Grade> grades = gradeRepo.findByCourseId(courseId);
        return grades.stream().map(gradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<GradeDto> findBySubmission(Long submissionId) {
        List<Grade> grades = gradeRepo.findBySubmissionId(submissionId);
        return grades.stream().map(gradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<GradeDto> findByCourseGrade(Long courseGradeId) {
        List<Grade> grades = gradeRepo.findByCourseGradeId(courseGradeId);
        return grades.stream().map(gradeMapper::entityToDto).collect(Collectors.toList());
    }
}
