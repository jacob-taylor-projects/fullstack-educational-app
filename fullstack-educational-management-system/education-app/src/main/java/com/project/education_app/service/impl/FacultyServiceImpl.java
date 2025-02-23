package com.project.education_app.service.impl;

import com.project.education_app.dtos.BasicFacultyDto;
import com.project.education_app.dtos.FullFacultyDto;
import com.project.education_app.entities.*;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.BasicFacultyMapper;
import com.project.education_app.mappers.FullFacultyMapper;
import com.project.education_app.repos.*;
import com.project.education_app.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepo facultyRepo;
    private final AnnouncementRepo announcementRepo;
    private final GradeRepo gradeRepo;
    private final LessonRepo lessonRepo;
    private final DiscussionRepo discussionRepo;
    private final ProjectRepo projectRepo;
    private final AssignmentRepo assignmentRepo;
    private final TestRepo testRepo;
    private final BasicFacultyMapper basicFacultyMapper;
    private final FullFacultyMapper fullFacultyMapper;

    @Override
    public BasicFacultyDto save(BasicFacultyDto basicFacultyDto) {
        Faculty faculty = basicFacultyMapper.dtoToEntity(basicFacultyDto);
        Faculty savedFaculty = facultyRepo.save(faculty);
        return basicFacultyMapper.entityToDto(savedFaculty);
    }

    @Override
    public List<FullFacultyDto> findAll() {
        List<Faculty> faculties = facultyRepo.findAll();
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public FullFacultyDto findById(Long id) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        return fullFacultyMapper.entityToDto(faculty);
    }

    @Override
    public BasicFacultyDto update(Long id, BasicFacultyDto basicFacultyDto) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        if (basicFacultyDto.getCredentials().getUsername() != null) {
            faculty.getCredentials().setUsername(basicFacultyDto.getCredentials().getUsername());
        }
        if (basicFacultyDto.getCredentials().getPassword() != null) {
            faculty.getCredentials().setPassword(basicFacultyDto.getCredentials().getPassword());
        }
        if (basicFacultyDto.getProfile().getFirstName() != null) {
            faculty.getProfile().setFirstName(basicFacultyDto.getProfile().getFirstName());
        }
        if (basicFacultyDto.getProfile().getLastName() != null) {
            faculty.getProfile().setLastName(basicFacultyDto.getProfile().getLastName());
        }
        if (basicFacultyDto.getProfile().getEmail() != null) {
            faculty.getProfile().setEmail(basicFacultyDto.getProfile().getEmail());
        }
        if (basicFacultyDto.getProfile().getPhoneNumber() != null) {
            faculty.getProfile().setPhoneNumber(basicFacultyDto.getProfile().getPhoneNumber());
        }
        if (basicFacultyDto.getAge() != 0) {
            faculty.setAge(basicFacultyDto.getAge());
        }
        if (basicFacultyDto.getGender() != null) {
            faculty.setGender(basicFacultyDto.getGender());
        }
        if (basicFacultyDto.getAddress() != null) {
            faculty.setAddress(basicFacultyDto.getAddress());
        }
        if (basicFacultyDto.getSalary() != 0) {
            faculty.setSalary(basicFacultyDto.getSalary());
        }
        if (basicFacultyDto.isAdmin() != faculty.isAdmin()) {
            faculty.setAdmin(basicFacultyDto.isAdmin());
        }
        if (basicFacultyDto.isTeacher() != faculty.isTeacher()) {
            faculty.setTeacher(basicFacultyDto.isTeacher());
        }

        Faculty updatedFaculty = facultyRepo.save(faculty);
        return basicFacultyMapper.entityToDto(updatedFaculty);
    }

    @Override
    public void delete(Long id) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        facultyRepo.delete(faculty);
    }

    @Override
    public List<FullFacultyDto> findByAge(int age) {
        List<Faculty> faculties = facultyRepo.findByAge(age);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByGender(String gender) {
        List<Faculty> faculties = facultyRepo.findByGender(gender);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByLastName(String lastName) {
        List<Faculty> faculties = facultyRepo.findByProfileLastName(lastName);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByUsername(String username) {
        List<Faculty> faculties = facultyRepo.findByCredentialsUsername(username);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findBySalary(double salary) {
        List<Faculty> faculties = facultyRepo.findBySalary(salary);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByAdmin(boolean admin) {
        List<Faculty> faculties = facultyRepo.findByAdmin(admin);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByTeacher(boolean teacher) {
        List<Faculty> faculties = facultyRepo.findByTeacher(teacher);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByAnnouncementId(Long announcementId) {
        List<Faculty> faculties = facultyRepo.findByAnnouncementsId(announcementId);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByGradeId(Long gradeId) {
        List<Faculty> faculties = facultyRepo.findByGradesId(gradeId);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByLessonId(Long lessonId) {
        List<Faculty> faculties = facultyRepo.findByLessonsId(lessonId);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByDiscussionId(Long discussionId) {
        List<Faculty> faculties = facultyRepo.findByDiscussionsId(discussionId);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByProjectId(Long projectId) {
        List<Faculty> faculties = facultyRepo.findByProjectsId(projectId);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByAssignmentId(Long assignmentId) {
        List<Faculty> faculties = facultyRepo.findByAssignmentsId(assignmentId);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullFacultyDto> findByTestId(Long testId) {
        List<Faculty> faculties = facultyRepo.findByTestsId(testId);
        return faculties.stream().map(fullFacultyMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public FullFacultyDto assignAnnouncements(Long id, List<Long> announcementIds) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        List<Announcement> announcements = announcementRepo.findAllById(announcementIds);
        faculty.setAnnouncements(announcements);
        Faculty updatedFaculty = facultyRepo.save(faculty);
        return fullFacultyMapper.entityToDto(updatedFaculty);
    }

    @Override
    public FullFacultyDto assignGrades(Long id, List<Long> gradeIds) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        List<Grade> grades = gradeRepo.findAllById(gradeIds);
        faculty.setGrades(grades);
        Faculty updatedFaculty = facultyRepo.save(faculty);
        return fullFacultyMapper.entityToDto(updatedFaculty);
    }

    @Override
    public FullFacultyDto assignLessons(Long id, List<Long> lessonIds) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        List<Lesson> lessons = lessonRepo.findAllById(lessonIds);
        faculty.setLessons(lessons);
        Faculty updatedFaculty = facultyRepo.save(faculty);
        return fullFacultyMapper.entityToDto(updatedFaculty);
    }

    @Override
    public FullFacultyDto assignDiscussions(Long id, List<Long> discussionIds) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        List<Discussion> discussions = discussionRepo.findAllById(discussionIds);
        faculty.setDiscussions(discussions);
        Faculty updatedFaculty = facultyRepo.save(faculty);
        return fullFacultyMapper.entityToDto(updatedFaculty);
    }

    @Override
    public FullFacultyDto assignProjects(Long id, List<Long> projectIds) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        List<Project> projects = projectRepo.findAllById(projectIds);
        faculty.setProjects(projects);
        Faculty updatedFaculty = facultyRepo.save(faculty);
        return fullFacultyMapper.entityToDto(updatedFaculty);
    }

    @Override
    public FullFacultyDto assignAssignments(Long id, List<Long> assignmentIds) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        List<Assignment> assignments = assignmentRepo.findAllById(assignmentIds);
        faculty.setAssignments(assignments);
        Faculty updatedFaculty = facultyRepo.save(faculty);
        return fullFacultyMapper.entityToDto(updatedFaculty);
    }

    @Override
    public FullFacultyDto assignTests(Long id, List<Long> testIds) {
        Faculty faculty = facultyRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Faculty not found with id " + id));
        List<Test> tests = testRepo.findAllById(testIds);
        faculty.setTests(tests);
        Faculty updatedFaculty = facultyRepo.save(faculty);
        return fullFacultyMapper.entityToDto(updatedFaculty);
    }
}
