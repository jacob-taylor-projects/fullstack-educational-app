package com.project.education_app.service.impl;

import com.project.education_app.dtos.BasicGuardianDto;
import com.project.education_app.dtos.FullGuardianDto;
import com.project.education_app.entities.Assignment;
import com.project.education_app.entities.Faculty;
import com.project.education_app.entities.Guardian;
import com.project.education_app.entities.Student;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.BasicGuardianMapper;
import com.project.education_app.mappers.FullGuardianMapper;
import com.project.education_app.repos.GuardianRepo;
import com.project.education_app.repos.StudentRepo;
import com.project.education_app.service.GuardianService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GuardianServiceImpl implements GuardianService {

    private final GuardianRepo guardianRepo;
    private final StudentRepo studentRepo;
    private final FullGuardianMapper fullGuardianMapper;
    private final BasicGuardianMapper basicGuardianMapper;

    @Override
    public BasicGuardianDto save(BasicGuardianDto basicGuardianDto) {
        Guardian guardian = basicGuardianMapper.dtoToEntity(basicGuardianDto);
        Guardian savedGuardian = guardianRepo.save(guardian);
        return basicGuardianMapper.entityToDto(savedGuardian);
    }

    @Override
    public List<FullGuardianDto> findAll() {
        List<Guardian> guardians = guardianRepo.findAll();
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public FullGuardianDto findById(Long id) {
        Guardian guardian = guardianRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Guardian not found with id: " + id));
        return fullGuardianMapper.entityToDto(guardian);
    }

    @Override
    public BasicGuardianDto update(Long id, BasicGuardianDto basicGuardianDto) {
        Guardian guardian = guardianRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Guardian not found with id " + id));
        if (basicGuardianDto.getCredentials().getUsername() != null) {
            guardian.getCredentials().setUsername(basicGuardianDto.getCredentials().getUsername());
        }
        if (basicGuardianDto.getCredentials().getPassword() != null) {
            guardian.getCredentials().setPassword(basicGuardianDto.getCredentials().getPassword());
        }
        if (basicGuardianDto.getProfile().getFirstName() != null) {
            guardian.getProfile().setFirstName(basicGuardianDto.getProfile().getFirstName());
        }
        if (basicGuardianDto.getProfile().getLastName() != null) {
            guardian.getProfile().setLastName(basicGuardianDto.getProfile().getLastName());
        }
        if (basicGuardianDto.getProfile().getEmail() != null) {
            guardian.getProfile().setEmail(basicGuardianDto.getProfile().getEmail());
        }
        if (basicGuardianDto.getProfile().getPhoneNumber() != null) {
            guardian.getProfile().setPhoneNumber(basicGuardianDto.getProfile().getPhoneNumber());
        }
        if (basicGuardianDto.getAge() != 0) {
            guardian.setAge(basicGuardianDto.getAge());
        }
        if (basicGuardianDto.getGender() != null) {
            guardian.setGender(basicGuardianDto.getGender());
        }
        if (basicGuardianDto.getAddress() != null) {
            guardian.setAddress(basicGuardianDto.getAddress());
        }


        Guardian updatedGuardian = guardianRepo.save(guardian);
        return basicGuardianMapper.entityToDto(updatedGuardian);
    }


    @Override
    public void delete(Long id) {
        Guardian guardian = guardianRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Guardian not found with id: " + id));
        guardianRepo.delete(guardian);
    }

    @Override
    public List<FullGuardianDto> findByFirstName(String firstName) {
        List<Guardian> guardians = guardianRepo.findByProfileFirstName(firstName);
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullGuardianDto> findByLastName(String lastName) {
        List<Guardian> guardians = guardianRepo.findByProfileLastName(lastName);
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullGuardianDto> findByEmail(String email) {
        List<Guardian> guardians = guardianRepo.findByProfileEmail(email);
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullGuardianDto> findByPhoneNumber(String phoneNumber) {
        List<Guardian> guardians = guardianRepo.findByProfilePhoneNumber(phoneNumber);
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullGuardianDto> findByUsername(String username) {
        List<Guardian> guardians = guardianRepo.findByCredentialsUsername(username);
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullGuardianDto> findByAge(int age) {
        List<Guardian> guardians = guardianRepo.findByAge(age);
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullGuardianDto> findByGender(String gender) {
        List<Guardian> guardians = guardianRepo.findByGender(gender);
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<FullGuardianDto> findByAddress(String address) {
        List<Guardian> guardians = guardianRepo.findByAddress(address);
        return guardians.stream().map(fullGuardianMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public FullGuardianDto assignStudents(Long id, List<Long> studentIds) {
        Guardian guardian = guardianRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Guardian not found with id:" + id));
        List<Student> students = studentRepo.findAllById(studentIds);
        guardian.setStudents(students);
        guardianRepo.save(guardian);
        return fullGuardianMapper.entityToDto(guardian);
    }
}
