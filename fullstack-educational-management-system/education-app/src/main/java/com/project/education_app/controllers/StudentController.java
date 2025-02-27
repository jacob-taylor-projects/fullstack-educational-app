package com.project.education_app.controllers;

import com.project.education_app.dtos.BasicStudentDto;
import com.project.education_app.dtos.FullStudentDto;
import com.project.education_app.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class StudentController {
    private final StudentService studentService;


    // Create Student
    @PostMapping
    public BasicStudentDto createStudent(@RequestBody BasicStudentDto basicStudentDto) {
        return studentService.save(basicStudentDto);
    }

    // Read All Students
    @GetMapping
    public List<FullStudentDto> getAllStudents() {
        return studentService.findAll();
    }

    // Read Student by ID
    @GetMapping("/{id}")
    public FullStudentDto getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    // Update Student (using PATCH)
    @PatchMapping("/{id}")
    public BasicStudentDto updateStudent(@PathVariable Long id, @RequestBody BasicStudentDto basicStudentDto) {
        return studentService.update(id, basicStudentDto);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }

    // Find Students by First Name
    @GetMapping("/firstName/{firstName}")
    public List<FullStudentDto> findByFirstName(@PathVariable String firstName) {
        return studentService.findByFirstName(firstName);
    }

    // Find Students by Last Name
    @GetMapping("/lastName/{lastName}")
    public List<FullStudentDto> findByLastName(@PathVariable String lastName) {
        return studentService.findByLastName(lastName);
    }

    // Find Students by Email
    @GetMapping("/email/{email}")
    public List<FullStudentDto> findByEmail(@PathVariable String email) {
        return studentService.findByEmail(email);
    }

    // Find Students by Phone Number
    @GetMapping("/phoneNumber/{phoneNumber}")
    public List<FullStudentDto> findByPhoneNumber(@PathVariable String phoneNumber) {
        return studentService.findByPhoneNumber(phoneNumber);
    }

    // Find Students by Username
    @GetMapping("/username/{username}")
    public List<FullStudentDto> findByUsername(@PathVariable String username) {
        return studentService.findByUsername(username);
    }

    // Find Students by Age
    @GetMapping("/age/{age}")
    public List<FullStudentDto> findByAge(@PathVariable int age) {
        return studentService.findByAge(age);
    }

    // Find Students by Age Greater Than
    @GetMapping("/age/greater/{age}")
    public List<FullStudentDto> findByAgeGreaterThan(@PathVariable int age) {
        return studentService.findByAgeGreaterThan(age);
    }

    // Find Students by Gender Containing
    @GetMapping("/gender/{gender}")
    public List<FullStudentDto> findByGenderContaining(@PathVariable String gender) {
        return studentService.findByGender(gender);
    }

    // Find Students by Course ID
    @GetMapping("/courses/{courseId}")
    public List<FullStudentDto> findByCoursesId(@PathVariable Long courseId) {
        return studentService.findByCoursesId(courseId);
    }

    // Find Students by Grade ID
    @GetMapping("/grades/{gradeId}")
    public List<FullStudentDto> findByGradesId(@PathVariable Long gradeId) {
        return studentService.findByGradesId(gradeId);
    }

    // Find Students by Course Grade ID
    @GetMapping("/courseGrades/{courseGradeId}")
    public List<FullStudentDto> findByCourseGradesId(@PathVariable Long courseGradeId) {
        return studentService.findByCourseGradesId(courseGradeId);
    }

    // Find Students by Post ID
    @GetMapping("/posts/{postId}")
    public List<FullStudentDto> findByPostsId(@PathVariable Long postId) {
        return studentService.findByPostsId(postId);
    }

    // Find Students by Comment ID
    @GetMapping("/comments/{commentId}")
    public List<FullStudentDto> findByCommentsId(@PathVariable Long commentId) {
        return studentService.findByCommentsId(commentId);
    }

    // Find Students by Submission ID
    @GetMapping("/submissions/{submissionId}")
    public List<FullStudentDto> findBySubmissionsId(@PathVariable Long submissionId) {
        return studentService.findBySubmissionsId(submissionId);
    }

    // Find Students by Project ID
    @GetMapping("/projects/{projectId}")
    public List<FullStudentDto> findByProjectsId(@PathVariable Long projectId) {
        return studentService.findByProjectsId(projectId);
    }

    // Find Students by Assignment ID
    @GetMapping("/assignments/{assignmentId}")
    public List<FullStudentDto> findByAssignmentsId(@PathVariable Long assignmentId) {
        return studentService.findByAssignmentsId(assignmentId);
    }

    // Find Students by Test ID
    @GetMapping("/tests/{testId}")
    public List<FullStudentDto> findByTestsId(@PathVariable Long testId) {
        return studentService.findByTestsId(testId);
    }

    // Find Students by Schedule ID
    @GetMapping("/schedules/{scheduleId}")
    public List<FullStudentDto> findBySchedulesId(@PathVariable Long scheduleId) {
        return studentService.findBySchedulesId(scheduleId);
    }

    // Assign Attendances to Student
    @PostMapping("/{id}/attendances")
    public FullStudentDto assignAttendancesToStudent(@PathVariable Long id, @RequestBody List<Long> attendanceIds) {
        return studentService.assignAttendances(id, attendanceIds);
    }

    // Assign Guardians to Student
    @PostMapping("/{id}/guardians")
    public FullStudentDto assignGuardiansToStudent(@PathVariable Long id, @RequestBody List<Long> guardianIds) {
        return studentService.assignGuardians(id, guardianIds);
    }

    // Assign Courses to Student
    @PostMapping("/{id}/courses")
    public FullStudentDto assignCoursesToStudent(@PathVariable Long id, @RequestBody List<Long> courseIds) {
        return studentService.assignCourses(id, courseIds);
    }

    // Assign Grades to Student
    @PostMapping("/{id}/grades")
    public FullStudentDto assignGradesToStudent(@PathVariable Long id, @RequestBody List<Long> gradeIds) {
        return studentService.assignGrades(id, gradeIds);
    }

    // Assign Course Grades to Student
    @PostMapping("/{id}/courseGrades")
    public FullStudentDto assignCourseGradesToStudent(@PathVariable Long id, @RequestBody List<Long> courseGradeIds) {
        return studentService.assignCourseGrades(id, courseGradeIds);
    }

    // Assign Posts to Student
    @PostMapping("/{id}/posts")
    public FullStudentDto assignPostsToStudent(@PathVariable Long id, @RequestBody List<Long> postIds) {
        return studentService.assignPosts(id, postIds);
    }

    // Assign Comments to Student
    @PostMapping("/{id}/comments")
    public FullStudentDto assignCommentsToStudent(@PathVariable Long id, @RequestBody List<Long> commentIds) {
        return studentService.assignComments(id, commentIds);
    }

    // Assign Submissions to Student
    @PostMapping("/{id}/submissions")
    public FullStudentDto assignSubmissionsToStudent(@PathVariable Long id, @RequestBody List<Long> submissionIds) {
        return studentService.assignSubmissions(id, submissionIds);
    }

    // Assign Projects to Student
    @PostMapping("/{id}/projects")
    public FullStudentDto assignProjectsToStudent(@PathVariable Long id, @RequestBody List<Long> projectIds) {
        return studentService.assignProjects(id, projectIds);
    }

    // Assign Assignments to Student
    @PostMapping("/{id}/assignments")
    public FullStudentDto assignAssignmentsToStudent(@PathVariable Long id, @RequestBody List<Long> assignmentIds) {
        return studentService.assignAssignments(id, assignmentIds);
    }

    // Assign Tests to Student
    @PostMapping("/{id}/tests")
    public FullStudentDto assignTestsToStudent(@PathVariable Long id, @RequestBody List<Long> testIds) {
        return studentService.assignTests(id, testIds);
    }

    // Assign Schedules to Student
    @PostMapping("/{id}/schedules")
    public FullStudentDto assignSchedulesToStudent(@PathVariable Long id, @RequestBody List<Long> scheduleIds) {
        return studentService.assignSchedules(id, scheduleIds);
    }
}
