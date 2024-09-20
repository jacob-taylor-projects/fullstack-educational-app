package com.project.education_app.dtos;

import com.project.education_app.entities.Comment;
import com.project.education_app.entities.Discussion;
import com.project.education_app.entities.Student;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class PostDto {
    private Long id;

    private String content;

    private DiscussionDto discussion;

    private BasicStudentDto student;

    private List<CommentDto> comments;
}
