package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Guardian {
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

    @ManyToMany
    @JoinTable(name = "student_guardian",
            joinColumns = @JoinColumn(name = "guardian_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students = new ArrayList<>();


    public List<Grade> getStudentsGrades(){
        List<Grade> grades=new ArrayList<>();
        for (Student student:students){
            grades.addAll(student.getGrades());
        }
        return grades;
    }
    public List<Course> getStudentsCourses(){
        List<Course> courses=new ArrayList<>();
        for (Student student:students){
            courses.addAll(student.getCourses());
        }
        return courses;
    }
}
