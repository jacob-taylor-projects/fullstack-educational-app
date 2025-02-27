package com.project.education_app.controllers;

import com.project.education_app.dtos.ResourceDto;
import com.project.education_app.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ResourceController {
    private final ResourceService resourceService;

    // Create Resource
    @PostMapping
    public ResourceDto createResource(@RequestBody ResourceDto resourceDto) {
        return resourceService.save(resourceDto);
    }

    // Read All Resources
    @GetMapping
    public List<ResourceDto> getAllResources() {
        return resourceService.findAll();
    }

    // Read Resource by ID
    @GetMapping("/{id}")
    public ResourceDto getResourceById(@PathVariable Long id) {
        return resourceService.findById(id);
    }

    // Update Resource (using PATCH)
    @PatchMapping("/{id}")
    public ResourceDto updateResource(@PathVariable Long id, @RequestBody ResourceDto resourceDto) {
        return resourceService.update(id, resourceDto);
    }

    // Delete Resource
    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable Long id) {
        resourceService.delete(id);
    }

    // Find Resources by Name
    @GetMapping("/name/{resourceName}")
    public List<ResourceDto> findByName(@PathVariable String resourceName) {
        return resourceService.findByName(resourceName);
    }

    // Find Resources by URL
    @GetMapping("/url/{url}")
    public List<ResourceDto> findByUrl(@PathVariable String url) {
        return resourceService.findByUrl(url);
    }
}
