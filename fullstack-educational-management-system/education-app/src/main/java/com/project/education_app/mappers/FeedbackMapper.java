package com.project.education_app.mappers;

import com.project.education_app.dtos.CommentDto;
import com.project.education_app.dtos.FeedbackDto;
import com.project.education_app.entities.Comment;
import com.project.education_app.entities.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = { SubmissionMapper.class })
public interface FeedbackMapper {
    FeedbackMapper INSTANCE= Mappers.getMapper(FeedbackMapper.class);
    FeedbackDto entityToDto(Feedback feedback);

    List<FeedbackDto> entitiesToDtos(List<Feedback> feedbacks);

    Feedback dtoToEntity(FeedbackDto feedbackDto);
}
