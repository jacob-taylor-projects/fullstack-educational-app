package com.project.education_app.service;

import com.project.education_app.dtos.ResourceDto;

import java.util.List;

public interface ResourceService {
    ResourceDto save(ResourceDto resourceDto);

    List<ResourceDto> findAll();

    ResourceDto findById(Long id);

    ResourceDto update(Long id, ResourceDto resourceDto);

    void delete(Long id);

    List<ResourceDto> findByName(String resourceName);

    List<ResourceDto> findByUrl(String url);
}
