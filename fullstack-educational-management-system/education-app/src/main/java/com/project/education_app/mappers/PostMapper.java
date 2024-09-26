package com.project.education_app.mappers;

import com.project.education_app.dtos.PostDto;
import com.project.education_app.dtos.ProjectDto;
import com.project.education_app.entities.Post;
import com.project.education_app.entities.Project;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { BasicStudentMapper.class})
public interface PostMapper {
    PostMapper INSTANCE= Mappers.getMapper(PostMapper.class);

    PostDto entityToDto(Post post);

    List<PostDto> entitiesToDtos(List<Post> posts);

    Post dtoToEntity(PostDto postDto);
}
