package com.project.education_app.mappers;

import com.project.education_app.dtos.CommentDto;
import com.project.education_app.entities.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { PostMapper.class,BasicStudentMapper.class })
public interface CommentMapper {
    CommentMapper INSTANCE= Mappers.getMapper(CommentMapper.class);
    CommentDto entityToDto(Comment comment);

    List<CommentDto> entitiesToDtos(List<Comment> comments);

    Comment dtoToEntity(CommentDto commentDto);
}
