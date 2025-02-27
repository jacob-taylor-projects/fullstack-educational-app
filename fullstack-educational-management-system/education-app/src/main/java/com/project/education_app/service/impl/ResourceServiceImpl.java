package com.project.education_app.service.impl;

import com.project.education_app.dtos.ResourceDto;
import com.project.education_app.entities.Resource;
import com.project.education_app.exceptions.NotFoundException;
import com.project.education_app.mappers.ResourceMapper;
import com.project.education_app.repos.ResourceRepo;
import com.project.education_app.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepo resourceRepo;
    private final ResourceMapper resourceMapper;

    @Override
    public ResourceDto save(ResourceDto resourceDto) {
        Resource resource = resourceMapper.dtoToEntity(resourceDto);
        Resource savedResource = resourceRepo.save(resource);
        return resourceMapper.entityToDto(savedResource);
    }

    @Override
    public List<ResourceDto> findAll() {
        List<Resource> resources = resourceRepo.findAll();
        return resources.stream().map(resourceMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public ResourceDto findById(Long id) {
        Resource resource = resourceRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Resource not found with id: " + id));
        return resourceMapper.entityToDto(resource);
    }

    @Override
    public ResourceDto update(Long id, ResourceDto resourceDto) {
        Resource resource = resourceRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Resource not found with id: " + id));

        if (resourceDto.getResourceName() != null) {
            resource.setResourceName(resourceDto.getResourceName());
        }
        if (resourceDto.getUrl() != null) {
            resource.setUrl(resourceDto.getUrl());
        }

        Resource updatedResource = resourceRepo.save(resource);
        return resourceMapper.entityToDto(updatedResource);
    }

    @Override
    public void delete(Long id) {
        Resource resource = resourceRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Resource not found with id: " + id));
        resourceRepo.delete(resource);
    }

    @Override
    public List<ResourceDto> findByName(String resourceName) {
        List<Resource> resources = resourceRepo.findByResourceNameContaining(resourceName);
        return resources.stream().map(resourceMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<ResourceDto> findByUrl(String url) {
        List<Resource> resources = resourceRepo.findByUrlContaining(url);
        return resources.stream().map(resourceMapper::entityToDto).collect(Collectors.toList());
    }
}
