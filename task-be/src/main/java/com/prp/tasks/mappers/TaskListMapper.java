package com.prp.tasks.mappers;

import com.prp.tasks.domain.dto.TaskListDto;
import com.prp.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}