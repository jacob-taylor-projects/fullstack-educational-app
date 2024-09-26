package com.project.education_app.repos;

import com.project.education_app.entities.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnnouncementRepo extends JpaRepository<Announcement,Long> {
    List<Announcement> findByTitleContaining(String title);

    List<Announcement> findByMessageContaining(String message);

    List<Announcement> findByAuthorId(Long authorId);


}
