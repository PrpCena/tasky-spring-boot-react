package com.prp.tasks.mappers;

import com.prp.tasks.domain.dto.TaskDto;
import com.prp.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}