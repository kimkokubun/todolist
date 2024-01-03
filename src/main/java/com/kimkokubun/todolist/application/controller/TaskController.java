package com.kimkokubun.todolist.application.controller;

import com.kimkokubun.todolist.domain.model.request.TaskRequest;
import com.kimkokubun.todolist.domain.service.TaskService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTask(@RequestBody TaskRequest taskRequest){
        this.taskService.addTask(taskRequest);
    }
}
