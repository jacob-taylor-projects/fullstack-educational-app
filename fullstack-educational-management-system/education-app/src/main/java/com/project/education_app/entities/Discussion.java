package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Discussion {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    @ManyToOne
    private Faculty teacher;

    @OneToMany(mappedBy = "discussion")
    private List<Post> posts;
}
