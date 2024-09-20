package com.project.education_app.dtos;

import com.project.education_app.entities.Problem;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BasicFacultyDto {
    private Long id;

    private CredentialDto credentials;

    private ProfileDto profile;

    private int age;

    private String gender;

    private String address;

    private double salary;

    private boolean admin;

    private boolean teacher;
}
