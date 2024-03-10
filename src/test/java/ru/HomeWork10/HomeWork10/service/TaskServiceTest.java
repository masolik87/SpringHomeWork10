package ru.HomeWork10.HomeWork10.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.HomeWork10.HomeWork10.model.Task;
import ru.HomeWork10.HomeWork10.model.TaskStatus;
import ru.HomeWork10.HomeWork10.repositories.TaskRepository;

import java.util.List;


@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    @DisplayName("Test")
    public void TasksByStatus() {
        Task task = new Task();
        given(taskRepository.findAllByStatus(TaskStatus.COMPLETED));
    }

    private void given(List<Task> allByStatus) {
    }
}