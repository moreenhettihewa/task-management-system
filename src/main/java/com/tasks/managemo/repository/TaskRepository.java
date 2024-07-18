package com.tasks.managemo.repository;

import com.tasks.managemo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface TaskRepository extends JpaRepository<Task, Long> {
}
