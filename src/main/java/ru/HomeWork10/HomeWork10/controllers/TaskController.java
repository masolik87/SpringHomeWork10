package ru.HomeWork10.HomeWork10.controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.HomeWork10.HomeWork10.model.Task;
import ru.HomeWork10.HomeWork10.model.TaskStatus;
import ru.HomeWork10.HomeWork10.service.TaskService;

import java.util.List;


    @RestController
    @AllArgsConstructor
    @RequestMapping("/tasks")
    public class TaskController {

        private TaskService taskService;

        @GetMapping
        public List<Task> getAllTasks() {
            return taskService.getAllTasks();
        }

        @PostMapping
        public Task addTask(@RequestBody Task task) {
            return taskService.addTask(task);
        }

        @GetMapping("/status/{status}")
        public List<Task> getTasksByStatus(@PathVariable TaskStatus status) {
            return taskService.getTasksByStatus(status);
        }

        @PutMapping("/{id}")
        public Task updateTaskStatus(@PathVariable Long id) {
            return taskService.updateTaskStatus(id);
        }

        @DeleteMapping("/{id}")
        public void deleteTask(@PathVariable Long id) {
            taskService.deleteTaskById(id);
        }
    }