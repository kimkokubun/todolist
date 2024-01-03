package com.kimkokubun.todolist.application.controller;

import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.service.TopicService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TopicController {

    private TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTask(@RequestBody TopicRequest topicRequest){
        this.topicService.addTask(topicRequest);
    }
}
