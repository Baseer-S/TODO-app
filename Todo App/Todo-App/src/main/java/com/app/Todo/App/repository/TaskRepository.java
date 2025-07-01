package com.app.Todo.App.repository;

import com.app.Todo.App.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}