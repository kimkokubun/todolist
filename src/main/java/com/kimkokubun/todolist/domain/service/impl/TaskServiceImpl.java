package com.kimkokubun.todolist.domain.service.impl;

import com.kimkokubun.todolist.domain.model.request.TaskRequest;
import com.kimkokubun.todolist.domain.model.response.HistoricResponse;
import com.kimkokubun.todolist.domain.model.response.TaskResponse;
import com.kimkokubun.todolist.domain.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    public TaskResponse addTask(TaskRequest task) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setName(task.getName());
        taskResponse.setDescription(task.getDescription());
        taskResponse.setColor(task.getColor());
        taskResponse.setPriority(task.getPriority());
        taskResponse.setHistoricResponse(new HistoricResponse("usuario1", LocalDateTime.now()));
        return taskResponse;
    }
}
