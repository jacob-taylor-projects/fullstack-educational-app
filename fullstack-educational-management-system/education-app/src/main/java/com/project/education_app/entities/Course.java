package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private String subject;

    private int credits;

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<Announcement> announcements=new HashSet<>();

    @OneToOne
    private Syllabus syllabus;

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<Attendance> attendances=new HashSet<>();

    @ManyToMany
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> students=new HashSet<>();

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<Grade> grades=new HashSet<>();

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<CourseGrade> courseGrades=new HashSet<>();

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<Resource> resources=new HashSet<>();

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
