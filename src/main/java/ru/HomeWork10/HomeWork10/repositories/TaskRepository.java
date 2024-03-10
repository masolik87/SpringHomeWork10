package ru.HomeWork10.HomeWork10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.HomeWork10.HomeWork10.model.Task;
import ru.HomeWork10.HomeWork10.model.TaskStatus;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByStatus(TaskStatus status);

}