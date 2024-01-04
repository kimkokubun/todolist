package com.kimkokubun.todolist.application.controller;

import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.service.TopicService;
import org.springframework.web.bind.annotation.*;

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
