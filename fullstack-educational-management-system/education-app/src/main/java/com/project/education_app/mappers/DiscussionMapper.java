package com.project.education_app.mappers;

import com.project.education_app.dtos.DiscussionDto;
import com.project.education_app.dtos.FeedbackDto;
import com.project.education_app.entities.Discussion;
import com.project.education_app.entities.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { BasicFacultyMapper.class,PostMapper.class })
public interface DiscussionMapper {
    DiscussionMapper INSTANCE= Mappers.getMapper(DiscussionMapper.class);
    DiscussionDto entityToDto(Discussion discussion);

    List<DiscussionDto> entitiesToDtos(List<Discussion> discussions);

    Discussion dtoToEntity(DiscussionDto discussionDto);
}
