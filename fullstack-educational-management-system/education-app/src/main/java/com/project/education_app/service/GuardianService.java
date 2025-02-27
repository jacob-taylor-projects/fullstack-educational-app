package com.project.education_app.service;

import com.project.education_app.dtos.BasicGuardianDto;
import com.project.education_app.dtos.FullGuardianDto;

import java.util.List;

public interface GuardianService {
    BasicGuardianDto save(BasicGuardianDto basicGuardianDto);

    List<FullGuardianDto> findAll();

    FullGuardianDto findById(Long id);

    BasicGuardianDto update(Long id, BasicGuardianDto basicGuardianDto);

    void delete(Long id);

    List<FullGuardianDto> findByFirstName(String firstName);

    List<FullGuardianDto> findByLastName(String lastName);

    List<FullGuardianDto> findByEmail(String email);

    List<FullGuardianDto> findByPhoneNumber(String phoneNumber);

    List<FullGuardianDto> findByUsername(String username);

    List<FullGuardianDto> findByAge(int age);

    List<FullGuardianDto> findByGender(String gender);

    List<FullGuardianDto> findByAddress(String address);

    FullGuardianDto assignStudents(Long id, List<Long> studentIds);
}
