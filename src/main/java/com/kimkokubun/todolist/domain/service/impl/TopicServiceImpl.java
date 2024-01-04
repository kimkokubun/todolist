package com.kimkokubun.todolist.domain.service.impl;

import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.model.response.HistoricResponse;
import com.kimkokubun.todolist.domain.model.response.TopicResponse;
import com.kimkokubun.todolist.domain.service.TopicService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TopicServiceImpl implements TopicService {

    @Override
    public TopicResponse addTask(TopicRequest task) {
        TopicResponse topicResponse = new TopicResponse();
        topicResponse.setName(task.getName() + "Caranga");
        topicResponse.setDescription(task.getDescription());
        topicResponse.setColor(task.getColor());
        topicResponse.setPriority(task.getPriority());
        topicResponse.setHistoricResponse(new HistoricResponse("usuario1", LocalDateTime.now()));
        return topicResponse;
    }
}
