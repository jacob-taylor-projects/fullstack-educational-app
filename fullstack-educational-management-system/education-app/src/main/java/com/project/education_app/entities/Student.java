package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    @Column(nullable = false)
    private Credential credentials;

    @Embedded
    @Column(nullable = false)
    private Profile profile;

    private int age;

    private String gender;

    private String address;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Attendance> attendances = new ArrayList<>();

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<StudentAnswer> studentAnswers = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "student_guardian",
    joinColumns = @JoinColumn(name = "student_id"),
    inverseJoinColumns = @JoinColumn(name = "guardian_id"))
    private List<Guardian> guardians = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses = new ArrayList<>();

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Grade> grades=new ArrayList<>();

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<CourseGrade> courseGrades=new ArrayList<>();

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Post> posts=new ArrayList<>();

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Comment> comments=new ArrayList<>();

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Submission> submissions=new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "project_student",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Project> projects=new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "assignment_student",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "assignment_id"))
    private List<Assignment> assignments=new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "test_student",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "test_id"))
    private List<Test> tests=new ArrayList<>();

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Schedule> schedules=new ArrayList<>();
}
