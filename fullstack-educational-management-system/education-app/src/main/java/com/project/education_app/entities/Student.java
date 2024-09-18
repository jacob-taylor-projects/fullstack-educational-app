package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
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
}
