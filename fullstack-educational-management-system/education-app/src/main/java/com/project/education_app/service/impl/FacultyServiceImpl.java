package com.project.education_app.service.impl;

import com.project.education_app.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FacultyServiceImpl implements FacultyService {
    private final FacultyService facultyService;
}
