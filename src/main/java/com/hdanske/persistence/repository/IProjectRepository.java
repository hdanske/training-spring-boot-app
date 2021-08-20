package com.hdanske.persistence.repository;

import com.hdanske.persistence.model.Project;

import java.util.Optional;

public interface IProjectRepository {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
