package com.project.education_app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class Profile {
    private String firstName;

    private String lastName;

    @Column(nullable = false)
    private String email;

    private String phoneNumber;
}
