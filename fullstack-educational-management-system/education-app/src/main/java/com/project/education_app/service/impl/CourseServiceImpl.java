package com.project.education_app.service.impl;

import com.project.education_app.dtos.CourseDto;
import com.project.education_app.dtos.FullCourseDto;
import com.project.education_app.dtos.UnitDto;
import com.project.education_app.entities.*;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.CourseMapper;
import com.project.education_app.repos.*;
import com.project.education_app.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;
    private final SyllabusRepo syllabusRepo;
    private final StudentRepo studentRepo;
    private final GradeRepo gradeRepo;
    private final CourseGradeRepo courseGradeRepo;
    private final ResourceRepo resourceRepo;
    private final UnitRepo unitRepo;
    private final ScheduleRepo scheduleRepo;
    private final SemesterRepo semesterRepo;
    private final CourseMapper courseMapper;

    @Override
    public CourseDto save(CourseDto courseDto) {
        Course course = courseMapper.dtoToEntity(courseDto);
        Course savedCourse = courseRepo.save(course);
        return courseMapper.entityToDto(savedCourse);
    }

    @Override
    public List<FullCourseDto> findAll() {
        List<Course> courses = courseRepo.findAll();
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public FullCourseDto findById(Long id) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + id));
        return courseMapper.entityToFullDto(course);
    }

    @Override
    public CourseDto update(Long id, CourseDto courseDto) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + id));

        if (courseDto.getName() != null) {
            course.setName(courseDto.getName());
        }
        if (courseDto.getDescription() != null) {
            course.setDescription(courseDto.getDescription());
        }
        if (courseDto.getSubject() != null) {
            course.setSubject(courseDto.getSubject());
        }
        if (courseDto.getCredits() != 0) {
            course.setCredits(courseDto.getCredits());
        }
        if (courseDto.getSyllabus() != null) {
            Syllabus syllabus = syllabusRepo.findById(courseDto.getSyllabus().getId())
                    .orElseThrow(() -> new NotFoundException("Syllabus not found with id: " + courseDto.getSyllabus().getId()));
            course.setSyllabus(syllabus);
        }
        if (courseDto.getUnits() != null) {
            List<Unit> units = unitRepo.findAllById(
                    courseDto.getUnits().stream().map(UnitDto::getId).collect(Collectors.toList()));
            course.setUnits(units);
        }

        Course updatedCourse = courseRepo.save(course);
        return courseMapper.entityToDto(updatedCourse);
    }

    @Override
    public void delete(Long id) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + id));
        courseRepo.delete(course);
    }

    @Override
    public List<FullCourseDto> findByName(String name) {
        List<Course> courses = courseRepo.findByName(name);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findBySubject(String subject) {
        List<Course> courses = courseRepo.findBySubject(subject);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findBySyllabus(Long syllabusId) {
        List<Course> courses = courseRepo.findBySyllabusId(syllabusId);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findByStudents(Long studentId) {
        List<Course> courses = courseRepo.findByStudentsId(studentId);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findByGrades(Long gradeId) {
        List<Course> courses = courseRepo.findByGradesId(gradeId);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findByCourseGrades(Long courseGradeId) {
        List<Course> courses = courseRepo.findByCourseGradesId(courseGradeId);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findByResources(Long resourceId) {
        List<Course> courses = courseRepo.findByResourcesId(resourceId);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findByUnits(Long unitId) {
        List<Course> courses = courseRepo.findByUnitsId(unitId);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findBySchedules(Long scheduleId) {
        List<Course> courses = courseRepo.findBySchedulesId(scheduleId);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public List<FullCourseDto> findBySemesters(Long semesterId) {
        List<Course> courses = courseRepo.findBySemestersId(semesterId);
        return courses.stream().map(courseMapper::entityToFullDto).collect(Collectors.toList());
    }

    @Override
    public FullCourseDto assignUnits(Long id, List<Long> unitIds) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + id));
        List<Unit> units = unitRepo.findAllById(unitIds);
        course.setUnits(units);
        Course updatedCourse = courseRepo.save(course);
        return courseMapper.entityToFullDto(updatedCourse);
    }

    @Override
    public FullCourseDto assignStudents(Long id, List<Long> studentIds) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + id));
        List<Student> students = studentRepo.findAllById(studentIds);
        course.setStudents(students);
        Course updatedCourse = courseRepo.save(course);
        return courseMapper.entityToFullDto(updatedCourse);
    }

    @Override
    public FullCourseDto assignGrades(Long id, List<Long> gradeIds) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + id));
        List<Grade> grades = gradeRepo.findAllById(gradeIds);
        course.setGrades(grades);
        Course updatedCourse = courseRepo.save(course);
        return courseMapper.entityToFullDto(updatedCourse);
    }

    @Override
    public FullCourseDto assignResources(Long id, List<Long> resourceIds) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + id));
        List<Resource> resources = resourceRepo.findAllById(resourceIds);
        course.setResources(resources);
        Course updatedCourse = courseRepo.save(course);
        return courseMapper.entityToFullDto(updatedCourse);
    }

    @Override
    public FullCourseDto assignSchedules(Long id, List<Long> scheduleIds) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Course not found with id: " + id));
        List<Schedule> schedules = scheduleRepo.findAllById(scheduleIds);
        course.setSchedules(schedules);
        Course updatedCourse = courseRepo.save(course);
        return courseMapper.entityToFullDto(updatedCourse);
    }
}
