package com.prp.tasks.mappers.impl;

import com.prp.tasks.domain.dto.TaskDto;
import com.prp.tasks.domain.entities.Task;
import com.prp.tasks.mappers.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                null,
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}