package com.project.education_app.repos;

import com.project.education_app.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post,Long> {
    List<Post> findByContentContaining(String content);

    List<Post> findByDiscussionId(Long discussionId);

    List<Post> findByStudentId(Long studentId);

    List<Post> findByCommentsId(Long commentId);
}
