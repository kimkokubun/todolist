package com.kimkokubun.todolist.application.controller;

import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.service.TopicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topics")
public class TopicController {

    private TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addTask(@RequestBody TopicRequest topicRequest){
        return ResponseEntity.ok(this.topicService.addTask(topicRequest));
    }
}
