package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BasicCourseDto {
    private Long id;

    private String name;

    private String description;

    private String subject;

    private int credits;
}
