package com.project.education_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor@Data
public class Syllabus {
    @Id
    @GeneratedValue
    private Long id;

   // private Course course;

    private String objectives;

    private String topics;

    //Add assignments;

    private String evaluationCriteria;

    //Add resources
}
