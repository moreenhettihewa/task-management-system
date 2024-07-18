package com.tasks.managemo.repository;

import com.tasks.managemo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
