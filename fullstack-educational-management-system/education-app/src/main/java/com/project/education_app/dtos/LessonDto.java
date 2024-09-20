package com.project.education_app.dtos;

import com.project.education_app.entities.Faculty;
import com.project.education_app.entities.Unit;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LessonDto {
    private Long id;

    private String title;

    private String content;


    private BasicFacultyDto author;

    private UnitDto unit;
}
