package com.project.education_app.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class DiscussionDto {
    private Long id;

    private String title;

    private String description;

    private BasicFacultyDto teacher;

    private List<PostDto> posts;

}
