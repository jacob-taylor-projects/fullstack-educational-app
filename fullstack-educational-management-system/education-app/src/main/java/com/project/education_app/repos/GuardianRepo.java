package com.project.education_app.repos;

import com.project.education_app.entities.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuardianRepo extends JpaRepository<Guardian,Long> {
    List<Guardian> findByProfileFirstName(String firstName);

    List<Guardian> findByProfileEmail(String email);

    List<Guardian> findByProfilePhoneNumber(String phoneNumber);

    List<Guardian> findByAge(int age);

    List<Guardian> findByGender(String gender);

    List<Guardian> findByStudentsId(Long studentId);

    List<Guardian> findByProfileLastName(String lastName);

    List<Guardian> findByCredentialsUsername(String username);

    List<Guardian> findByAddress(String address);
}
