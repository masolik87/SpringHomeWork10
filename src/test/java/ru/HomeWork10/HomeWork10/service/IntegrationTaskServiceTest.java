package ru.HomeWork10.HomeWork10.service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.HomeWork10.HomeWork10.model.Task;
import ru.HomeWork10.HomeWork10.model.TaskStatus;
import ru.HomeWork10.HomeWork10.repositories.TaskRepository;

import java.util.List;

@SpringBootTest
public class IntegrationTaskServiceTest {
    @MockBean
    private TaskRepository taskRepository;

    @Autowired
    private TaskService taskService;

    @Test
    @DisplayName("Test")
    public void TasksByStatus() {
        Task task = new Task();
        given(taskRepository.findAllByStatus(TaskStatus.NOT_STARTED));
    }

    private void given(List<Task> allByStatus) {
    }
}