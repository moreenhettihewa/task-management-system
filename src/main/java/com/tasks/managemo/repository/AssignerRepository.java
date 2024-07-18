package com.tasks.managemo.repository;

import com.tasks.managemo.model.Assigner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface AssignerRepository extends JpaRepository<Assigner, Long> {
}
