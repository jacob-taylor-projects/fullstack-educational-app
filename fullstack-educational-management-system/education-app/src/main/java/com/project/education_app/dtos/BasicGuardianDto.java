package com.project.education_app.dtos;

import com.project.education_app.entities.Credential;
import com.project.education_app.entities.Profile;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BasicGuardianDto {
    private Long id;

    private CredentialDto credentials;

    private ProfileDto profile;

    private int age;

    private String gender;

    private String address;
}
