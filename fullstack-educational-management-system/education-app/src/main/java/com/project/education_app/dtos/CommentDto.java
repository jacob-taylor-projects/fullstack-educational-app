package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class CommentDto {
    private Long id;

    private String content;

    private PostDto post;

    private BasicStudentDto student;
}
