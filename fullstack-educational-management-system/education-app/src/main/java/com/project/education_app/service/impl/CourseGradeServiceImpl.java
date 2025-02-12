package com.project.education_app.service.impl;

import com.project.education_app.dtos.CourseGradeDto;
import com.project.education_app.dtos.GradeDto;
import com.project.education_app.entities.Course;
import com.project.education_app.entities.CourseGrade;
import com.project.education_app.entities.Grade;
import com.project.education_app.entities.Student;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.BasicStudentMapper;
import com.project.education_app.mappers.CourseGradeMapper;
import com.project.education_app.mappers.CourseMapper;
import com.project.education_app.repos.CourseGradeRepo;
import com.project.education_app.repos.CourseRepo;
import com.project.education_app.repos.GradeRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.service.CourseGradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseGradeServiceImpl implements CourseGradeService {
    private final CourseGradeRepo courseGradeRepo;
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;
    private final GradeRepo gradeRepo;
    private final CourseMapper courseMapper;
    private final CourseGradeMapper courseGradeMapper;
    private final BasicStudentMapper basicStudentMapper;

    @Override
    public CourseGradeDto createCourseGrade(CourseGradeDto courseGradeDto) {
        Student student = studentRepo.findById(courseGradeDto.getStudent().getId())
                .orElseThrow(() -> new NotFoundException("Student not found with id " + courseGradeDto.getStudent().getId()));
        Course course = courseRepo.findById(courseGradeDto.getCourse().getId())
                .orElseThrow(() -> new NotFoundException("Course not found with id " + courseGradeDto.getCourse().getId()));
        CourseGrade courseGrade = courseGradeMapper.dtoToEntity(courseGradeDto);
        courseGrade.setStudent(student);
        courseGrade.setCourse(course);
        CourseGrade savedCourseGrade = courseGradeRepo.save(courseGrade);
        CourseGradeDto savedCourseGradeDto = courseGradeMapper.entityToDto(savedCourseGrade);
        savedCourseGradeDto.setStudent(basicStudentMapper.entityToDto(savedCourseGrade.getStudent()));
        savedCourseGradeDto.setCourse(courseMapper.entityToDto(savedCourseGrade.getCourse()));
        return savedCourseGradeDto;
    }

    @Override
    public List<CourseGradeDto> findAll() {
        List<CourseGrade> courseGrades = courseGradeRepo.findAll();
        return courseGrades.stream().map(courseGradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public CourseGradeDto findById(Long id) {
        CourseGrade courseGrade = courseGradeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("CourseGrade not found with id " + id));
        return courseGradeMapper.entityToDto(courseGrade);
    }

    @Override
    public CourseGradeDto update(Long id, CourseGradeDto courseGradeDto) {
        CourseGrade courseGrade = courseGradeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("CourseGrade not found with id " + id));
        if (courseGradeDto.getOverallGrade() != 0) {
            courseGrade.setOverallGrade(courseGradeDto.getOverallGrade());
        }
        if (courseGradeDto.getStudent() != null) {
            Student student = studentRepo.findById(courseGradeDto.getStudent().getId())
                    .orElseThrow(() -> new NotFoundException("Student not found with id" + courseGradeDto.getStudent().getId()));
            courseGrade.setStudent(student);
        }
        if (courseGradeDto.getCourse() != null) {
            Course course = courseRepo.findById(courseGradeDto.getCourse().getId())
                    .orElseThrow(() -> new NotFoundException("Course not found with id" + courseGradeDto.getCourse().getId()));
            courseGrade.setCourse(course);
        }
        if (courseGradeDto.getGrades() != null) {
            List<Grade> grades = gradeRepo.findAllById(
                    courseGradeDto.getGrades().stream().map(GradeDto::getId).collect(Collectors.toList()));
            courseGrade.setGrades(grades);
        }

        CourseGrade updatedCourseGrade = courseGradeRepo.save(courseGrade);
        CourseGradeDto updatedCourseGradeDto = courseGradeMapper.entityToDto(updatedCourseGrade);
        updatedCourseGradeDto.setStudent(basicStudentMapper.entityToDto(updatedCourseGrade.getStudent()));
        updatedCourseGradeDto.setCourse(courseMapper.entityToDto(updatedCourseGrade.getCourse()));
        return updatedCourseGradeDto;
    }

    @Override
    public void delete(Long id) {
        CourseGrade courseGrade = courseGradeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("CourseGrade not found with id" + id));
        courseGradeRepo.delete(courseGrade);
    }

    @Override
    public List<CourseGradeDto> findByStudent(Long studentId) {
        List<CourseGrade> courseGrades = courseGradeRepo.findByStudentId(studentId);
        return courseGrades.stream().map(courseGradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<CourseGradeDto> findByCourse(Long courseId) {
        List<CourseGrade> courseGrades = courseGradeRepo.findByCourseId(courseId);
        return courseGrades.stream().map(courseGradeMapper::entityToDto).collect(Collectors.toList());
    }


    @Override
    public List<CourseGradeDto> findByGradeGreaterThan(double grade) {
        List<CourseGrade> courseGrades = courseGradeRepo.findByOverallGradeGreaterThan(grade);
        return courseGrades.stream().map(courseGradeMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public CourseGradeDto assignGrades(Long id, List<Long> gradeIds) {
        CourseGrade courseGrade = courseGradeRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("CourseGrade not found with id" + id));
        List<Grade> grades = gradeRepo.findAllById(gradeIds);
        courseGrade.setGrades(grades);
        CourseGrade updatedCourseGrade = courseGradeRepo.save(courseGrade);
        return courseGradeMapper.entityToDto(updatedCourseGrade);
    }
}
