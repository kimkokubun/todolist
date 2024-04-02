package com.kimkokubun.todolist.application.controller;

import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.model.response.TopicResponse;
import com.kimkokubun.todolist.domain.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    TopicService topicService;

    @PostMapping
    public ResponseEntity<TopicResponse> addTopic(@RequestBody TopicRequest topicRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.topicService.addTopic(topicRequest));
    }

    @PutMapping("/{idTopic}")
    public ResponseEntity<TopicResponse> updateTopic(@PathVariable Long idTopic, @RequestBody TopicRequest topicRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(this.topicService.updateTopic(idTopic, topicRequest));
    }

    @GetMapping("/{idTopic}")
    public ResponseEntity<TopicResponse> getTopic(@PathVariable Long idTopic){
        return ResponseEntity.status(HttpStatus.OK).body(this.topicService.getTopic(idTopic));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<TopicResponse>> getAllTopics(){
        return ResponseEntity.status(HttpStatus.OK).body(this.topicService.getAllTopics());
    }

    @DeleteMapping("/{idTopic}")
    public ResponseEntity<String> deleteTopic(@PathVariable Long idTopic){
        this.topicService.deleteTopic(idTopic);
        return ResponseEntity.status(HttpStatus.OK).body("Topico excluido com sucesso");
    }
}
