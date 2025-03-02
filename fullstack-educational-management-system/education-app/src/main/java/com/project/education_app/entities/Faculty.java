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
public class Faculty {
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

    private double salary;

    private boolean admin;

    private boolean teacher;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Announcement> announcements = new ArrayList<>();

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Grade> grades=new ArrayList<>();

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Lesson> lessons = new ArrayList<>();

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Discussion> discussions=new ArrayList<>();

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Project> projects=new ArrayList<>();

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Assignment> assignments=new ArrayList<>();

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Test> tests=new ArrayList<>();
}
