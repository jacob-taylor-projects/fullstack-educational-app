package com.project.education_app.service.impl;

import com.project.education_app.dtos.BasicStudentDto;
import com.project.education_app.dtos.FullStudentDto;
import com.project.education_app.entities.*;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.BasicStudentMapper;
import com.project.education_app.mappers.FullStudentMapper;
import com.project.education_app.repos.*;
import com.project.education_app.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepository;
    private final AttendanceRepo attendanceRepository;
    private final GuardianRepo guardianRepository;
    private final CourseRepo courseRepository;
    private final GradeRepo gradeRepository;
    private final CourseGradeRepo courseGradeRepository;
    private final PostRepo postRepository;
    private final CommentRepo commentRepository;
    private final SubmissionRepo submissionRepository;
    private final ProjectRepo projectRepository;
    private final AssignmentRepo assignmentRepository;
    private final TestRepo testRepository;
    private final ScheduleRepo scheduleRepository;
    private final FullStudentMapper fullStudentMapper;
    private final BasicStudentMapper basicStudentMapper;

    @Override
    public BasicStudentDto save(BasicStudentDto basicStudentDto) {
        Student student = basicStudentMapper.dtoToEntity(basicStudentDto);
        Student savedStudent = studentRepository.save(student);
        return basicStudentMapper.entityToDto(savedStudent);
    }

    @Override
    public List<FullStudentDto> findAll() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public FullStudentDto findById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        return fullStudentMapper.entityToDto(student);
    }

    @Override
    public BasicStudentDto update(Long id, BasicStudentDto basicStudentDto) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id " + id));
        if (basicStudentDto.getCredentials().getUsername() != null) {
            student.getCredentials().setUsername(basicStudentDto.getCredentials().getUsername());
        }
        if (basicStudentDto.getCredentials().getPassword() != null) {
            student.getCredentials().setPassword(basicStudentDto.getCredentials().getPassword());
        }
        if (basicStudentDto.getProfile().getFirstName() != null) {
            student.getProfile().setFirstName(basicStudentDto.getProfile().getFirstName());
        }
        if (basicStudentDto.getProfile().getLastName() != null) {
            student.getProfile().setLastName(basicStudentDto.getProfile().getLastName());
        }
        if (basicStudentDto.getProfile().getEmail() != null) {
            student.getProfile().setEmail(basicStudentDto.getProfile().getEmail());
        }
        if (basicStudentDto.getProfile().getPhoneNumber() != null) {
            student.getProfile().setPhoneNumber(basicStudentDto.getProfile().getPhoneNumber());
        }
        if (basicStudentDto.getAge() != 0) {
            student.setAge(basicStudentDto.getAge());
        }
        if (basicStudentDto.getGender() != null) {
            student.setGender(basicStudentDto.getGender());
        }
        if (basicStudentDto.getAddress() != null) {
            student.setAddress(basicStudentDto.getAddress());
        }


        Student updatedStudent = studentRepository.save(student);
        return basicStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public void delete(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        studentRepository.delete(student);
    }

    // Find methods

    @Override
    public List<FullStudentDto> findByFirstName(String firstName) {
        List<Student> students = studentRepository.findByProfileFirstName(firstName);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByLastName(String lastName) {
        List<Student> students = studentRepository.findByProfileLastName(lastName);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByEmail(String email) {
        List<Student> students = studentRepository.findByProfileEmailContaining(email);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByPhoneNumber(String phoneNumber) {
        List<Student> students = studentRepository.findByProfilePhoneNumberContaining(phoneNumber);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByUsername(String username) {
        List<Student> students = studentRepository.findByCredentialsUsername(username);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByAge(int age) {
        List<Student> students = studentRepository.findByAge(age);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByGender(String gender) {
        List<Student> students = studentRepository.findByGenderContaining(gender);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByAddress(String address) {
        List<Student> students = studentRepository.findByAddress(address);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }


    @Override
    public List<FullStudentDto> findByAgeGreaterThan(int age) {
        List<Student> students = studentRepository.findByAgeGreaterThan(age);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByCoursesId(Long courseId) {
        List<Student> students = studentRepository.findByCoursesId(courseId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByGradesId(Long gradeId) {
        List<Student> students = studentRepository.findByGradesId(gradeId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByCourseGradesId(Long courseGradeId) {
        List<Student> students = studentRepository.findByCourseGradesId(courseGradeId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByPostsId(Long postId) {
        List<Student> students = studentRepository.findByPostsId(postId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByCommentsId(Long commentId) {
        List<Student> students = studentRepository.findByCommentsId(commentId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findBySubmissionsId(Long submissionId) {
        List<Student> students = studentRepository.findBySubmissionsId(submissionId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByProjectsId(Long projectId) {
        List<Student> students = studentRepository.findByProjectsId(projectId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByAssignmentsId(Long assignmentId) {
        List<Student> students = studentRepository.findByAssignmentsId(assignmentId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findByTestsId(Long testId) {
        List<Student> students = studentRepository.findByTestsId(testId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullStudentDto> findBySchedulesId(Long scheduleId) {
        List<Student> students = studentRepository.findBySchedulesId(scheduleId);
        return students.stream().map(fullStudentMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public FullStudentDto assignAttendances(Long id, List<Long> attendanceIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Attendance> attendances = attendanceRepository.findAllById(attendanceIds);
        student.setAttendances(attendances);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignGuardians(Long id, List<Long> guardianIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Guardian> guardians = guardianRepository.findAllById(guardianIds);
        student.setGuardians(guardians);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignCourses(Long id, List<Long> courseIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Course> courses = courseRepository.findAllById(courseIds);
        student.setCourses(courses);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignGrades(Long id, List<Long> gradeIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Grade> grades = gradeRepository.findAllById(gradeIds);
        student.setGrades(grades);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignCourseGrades(Long id, List<Long> courseGradeIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<CourseGrade> courseGrades = courseGradeRepository.findAllById(courseGradeIds);
        student.setCourseGrades(courseGrades);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignPosts(Long id, List<Long> postIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Post> posts = postRepository.findAllById(postIds);
        student.setPosts(posts);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignComments(Long id, List<Long> commentIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Comment> comments = commentRepository.findAllById(commentIds);
        student.setComments(comments);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignSubmissions(Long id, List<Long> submissionIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Submission> submissions = submissionRepository.findAllById(submissionIds);
        student.setSubmissions(submissions);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignProjects(Long id, List<Long> projectIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Project> projects = projectRepository.findAllById(projectIds);
        student.setProjects(projects);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignAssignments(Long id, List<Long> assignmentIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Assignment> assignments = assignmentRepository.findAllById(assignmentIds);
        student.setAssignments(assignments);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignTests(Long id, List<Long> testIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Test> tests = testRepository.findAllById(testIds);
        student.setTests(tests);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }

    @Override
    public FullStudentDto assignSchedules(Long id, List<Long> scheduleIds) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        List<Schedule> schedules = scheduleRepository.findAllById(scheduleIds);
        student.setSchedules(schedules);
        Student updatedStudent = studentRepository.save(student);
        return fullStudentMapper.entityToDto(updatedStudent);
    }
}
