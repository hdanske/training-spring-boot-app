package com.hdanske.persistence.repository.impl;

import com.hdanske.persistence.model.Project;
import com.hdanske.persistence.repository.IProjectRepository;

import java.util.Optional;

public class ProjectRepositoryImpl implements IProjectRepository {
    @Override
    public Optional<Project> findById(Long id) {
        return null;
    }

    @Override
    public Project save(Project project) {
        return null;
    }
}
