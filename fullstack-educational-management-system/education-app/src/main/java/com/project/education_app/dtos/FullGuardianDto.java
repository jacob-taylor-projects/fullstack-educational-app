package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class FullGuardianDto {
    private Long id;

    private CredentialDto credentials;

    private ProfileDto profile;

    private int age;

    private String gender;

    private String address;

    private List<BasicStudentDto> students;
}
