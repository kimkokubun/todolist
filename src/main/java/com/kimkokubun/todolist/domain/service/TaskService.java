package com.kimkokubun.todolist.domain.service;

import com.kimkokubun.todolist.domain.model.request.TaskRequest;
import com.kimkokubun.todolist.domain.model.response.TaskResponse;

public interface TaskService {

    TaskResponse addTask(TaskRequest task);
}
