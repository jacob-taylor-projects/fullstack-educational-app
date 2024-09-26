package com.project.education_app.repos;

import com.project.education_app.entities.Discussion;
import com.project.education_app.entities.Faculty;
import com.project.education_app.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscussionRepo extends JpaRepository<Discussion,Long> {
    List<Discussion> findByTitleContaining(String title);

    List<Discussion> findByDescriptionContaining(String description);

    List<Discussion> findByTeacherId(Long teacherId);

    List<Discussion> findByPostsId(Long postId);

}
