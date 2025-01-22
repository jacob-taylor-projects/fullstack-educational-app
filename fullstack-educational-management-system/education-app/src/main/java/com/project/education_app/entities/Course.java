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
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private String subject;

    private int credits;

    @OneToOne
    private Syllabus syllabus;

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Attendance> attendances = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students = new ArrayList<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    private List<Grade> grades = new ArrayList<>();

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<CourseGrade> courseGrades = new ArrayList<>();

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Resource> resources = new ArrayList<>();

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Unit> units=new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "schedule_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "schedule_id"))
    private List<Schedule> schedules=new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "semester_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "semester_id"))
    private List<Semester> semesters=new ArrayList<>();
}
