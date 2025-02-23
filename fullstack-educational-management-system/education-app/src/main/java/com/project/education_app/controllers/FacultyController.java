package com.project.education_app.controllers;

import com.project.education_app.dtos.BasicFacultyDto;
import com.project.education_app.dtos.FullFacultyDto;
import com.project.education_app.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class FacultyController {
    private final FacultyService facultyService;

    @PostMapping
    public BasicFacultyDto createFaculty(@RequestBody BasicFacultyDto basicFacultyDto) {
        return facultyService.save(basicFacultyDto);
    }

    @GetMapping
    public List<FullFacultyDto> getAllFaculties() {
        return facultyService.findAll();
    }

    @GetMapping("/{id}")
    public FullFacultyDto getFacultyById(@PathVariable Long id) {
        return facultyService.findById(id);
    }

    @PatchMapping("/{id}")
    public BasicFacultyDto updateFaculty(@PathVariable Long id, @RequestBody BasicFacultyDto basicFacultyDto) {
        return facultyService.update(id, basicFacultyDto);
    }

    @DeleteMapping("/{id}")
    public void deleteFaculty(@PathVariable Long id) {
        facultyService.delete(id);
    }

    @GetMapping("/age/{age}")
    public List<FullFacultyDto> findByAge(@PathVariable int age) {
        return facultyService.findByAge(age);
    }

    @GetMapping("/gender/{gender}")
    public List<FullFacultyDto> findByGender(@PathVariable String gender) {
        return facultyService.findByGender(gender);
    }

    @GetMapping("/lastName/{lastName}")
    public List<FullFacultyDto> findByLastName(@PathVariable String lastName) {
        return facultyService.findByLastName(lastName);
    }

    @GetMapping("/username/{username}")
    public List<FullFacultyDto> findByUsername(@PathVariable String username) {
        return facultyService.findByUsername(username);
    }

    @GetMapping("/salary/{salary}")
    public List<FullFacultyDto> findBySalary(@PathVariable double salary) {
        return facultyService.findBySalary(salary);
    }

    @GetMapping("/admin/{admin}")
    public List<FullFacultyDto> findByAdmin(@PathVariable boolean admin) {
        return facultyService.findByAdmin(admin);
    }

    @GetMapping("/teacher/{teacher}")
    public List<FullFacultyDto> findByTeacher(@PathVariable boolean teacher) {
        return facultyService.findByTeacher(teacher);
    }

    @GetMapping("/announcement/{announcementId}")
    public List<FullFacultyDto> findByAnnouncementId(@PathVariable Long announcementId) {
        return facultyService.findByAnnouncementId(announcementId);
    }

    @GetMapping("/grade/{gradeId}")
    public List<FullFacultyDto> findByGradeId(@PathVariable Long gradeId) {
        return facultyService.findByGradeId(gradeId);
    }

    @GetMapping("/lesson/{lessonId}")
    public List<FullFacultyDto> findByLessonId(@PathVariable Long lessonId) {
        return facultyService.findByLessonId(lessonId);
    }

    @GetMapping("/discussion/{discussionId}")
    public List<FullFacultyDto> findByDiscussionId(@PathVariable Long discussionId) {
        return facultyService.findByDiscussionId(discussionId);
    }

    @GetMapping("/project/{projectId}")
    public List<FullFacultyDto> findByProjectId(@PathVariable Long projectId) {
        return facultyService.findByProjectId(projectId);
    }

    @GetMapping("/assignment/{assignmentId}")
    public List<FullFacultyDto> findByAssignmentId(@PathVariable Long assignmentId) {
        return facultyService.findByAssignmentId(assignmentId);
    }

    @GetMapping("/test/{testId}")
    public List<FullFacultyDto> findByTestId(@PathVariable Long testId) {
        return facultyService.findByTestId(testId);
    }

    @PostMapping("/{id}/announcements")
    public FullFacultyDto assignAnnouncements(@PathVariable Long id, @RequestBody List<Long> announcementIds) {
        return facultyService.assignAnnouncements(id, announcementIds);
    }

    @PostMapping("/{id}/grades")
    public FullFacultyDto assignGrades(@PathVariable Long id, @RequestBody List<Long> gradeIds) {
        return facultyService.assignGrades(id, gradeIds);
    }

    @PostMapping("/{id}/lessons")
    public FullFacultyDto assignLessons(@PathVariable Long id, @RequestBody List<Long> lessonIds) {
        return facultyService.assignLessons(id, lessonIds);
    }

    @PostMapping("/{id}/discussions")
    public FullFacultyDto assignDiscussions(@PathVariable Long id, @RequestBody List<Long> discussionIds) {
        return facultyService.assignDiscussions(id, discussionIds);
    }

    @PostMapping("/{id}/projects")
    public FullFacultyDto assignProjects(@PathVariable Long id, @RequestBody List<Long> projectIds) {
        return facultyService.assignProjects(id, projectIds);
    }

    @PostMapping("/{id}/assignments")
    public FullFacultyDto assignAssignments(@PathVariable Long id, @RequestBody List<Long> assignmentIds) {
        return facultyService.assignAssignments(id, assignmentIds);
    }

    @PostMapping("/{id}/tests")
    public FullFacultyDto assignTests(@PathVariable Long id, @RequestBody List<Long> testIds) {
        return facultyService.assignTests(id, testIds);
    }
}


