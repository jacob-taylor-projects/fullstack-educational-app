package com.project.education_app.repos;

import com.project.education_app.entities.Comment;
import com.project.education_app.entities.Post;
import com.project.education_app.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {
    List<Comment> findByPostId(Long postId);

    List<Comment> findByStudentId(Long studentId);

    List<Comment> findByPostIdAndStudentId(Long postId,Long studentId);
}
