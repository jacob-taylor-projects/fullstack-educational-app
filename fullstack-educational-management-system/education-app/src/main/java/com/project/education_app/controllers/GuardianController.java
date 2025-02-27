package com.project.education_app.controllers;

import com.project.education_app.dtos.BasicGuardianDto;
import com.project.education_app.dtos.FullGuardianDto;
import com.project.education_app.service.GuardianService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guardians")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class GuardianController {
    private final GuardianService guardianService;

    // Create Guardian
    @PostMapping
    public BasicGuardianDto createGuardian(@RequestBody BasicGuardianDto basicGuardianDto) {
        return guardianService.save(basicGuardianDto);
    }

    // Read All Guardians
    @GetMapping
    public List<FullGuardianDto> getAllGuardians() {
        return guardianService.findAll();
    }

    // Read Guardian by ID
    @GetMapping("/{id}")
    public FullGuardianDto getGuardianById(@PathVariable Long id) {
        return guardianService.findById(id);
    }

    // Update Guardian (using PATCH)
    @PatchMapping("/{id}")
    public BasicGuardianDto updateGuardian(@PathVariable Long id, @RequestBody BasicGuardianDto basicGuardianDto) {
        return guardianService.update(id, basicGuardianDto);
    }

    // Delete Guardian
    @DeleteMapping("/{id}")
    public void deleteGuardian(@PathVariable Long id) {
        guardianService.delete(id);
    }

    // Find Guardians by First Name
    @GetMapping("/firstName/{firstName}")
    public List<FullGuardianDto> findByFirstName(@PathVariable String firstName) {
        return guardianService.findByFirstName(firstName);
    }

    // Find Guardians by Last Name
    @GetMapping("/lastName/{lastName}")
    public List<FullGuardianDto> findByLastName(@PathVariable String lastName) {
        return guardianService.findByLastName(lastName);
    }

    // Find Guardians by Email
    @GetMapping("/email/{email}")
    public List<FullGuardianDto> findByEmail(@PathVariable String email) {
        return guardianService.findByEmail(email);
    }

    // Find Guardians by Phone Number
    @GetMapping("/phoneNumber/{phoneNumber}")
    public List<FullGuardianDto> findByPhoneNumber(@PathVariable String phoneNumber) {
        return guardianService.findByPhoneNumber(phoneNumber);
    }

    // Find Guardians by Username
    @GetMapping("/username/{username}")
    public List<FullGuardianDto> findByUsername(@PathVariable String username) {
        return guardianService.findByUsername(username);
    }

    // Find Guardians by Age
    @GetMapping("/age/{age}")
    public List<FullGuardianDto> findByAge(@PathVariable int age) {
        return guardianService.findByAge(age);
    }

    // Find Guardians by Gender
    @GetMapping("/gender/{gender}")
    public List<FullGuardianDto> findByGender(@PathVariable String gender) {
        return guardianService.findByGender(gender);
    }

    // Find Guardians by Address
    @GetMapping("/address/{address}")
    public List<FullGuardianDto> findByAddress(@PathVariable String address) {
        return guardianService.findByAddress(address);
    }

    // Assign Students to Guardian
    @PostMapping("/{id}/students")
    public FullGuardianDto assignStudentsToGuardian(@PathVariable Long id, @RequestBody List<Long> studentIds) {
        return guardianService.assignStudents(id, studentIds);
    }
}
