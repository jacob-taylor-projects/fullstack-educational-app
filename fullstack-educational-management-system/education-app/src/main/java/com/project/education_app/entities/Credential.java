package com.project.education_app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Data
public class Credential {
    @Column(nullable = false)
    private String username;

    private String password;
}
