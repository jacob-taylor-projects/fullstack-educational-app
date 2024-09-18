package com.project.education_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @ManyToOne
    private Discussion discussion;

    @ManyToOne
    private Student student;

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
    private List<Comment> comments;
}
