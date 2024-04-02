package com.kimkokubun.todolist.domain.service;

import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.model.response.TopicResponse;

import java.util.List;

public interface TopicService {

    TopicResponse addTopic(TopicRequest topic);
    TopicResponse updateTopic(Long idTopic, TopicRequest topicRequest);

    TopicResponse getTopic(Long idTopic);

    List<TopicResponse> getAllTopics();

    void deleteTopic(Long idTopic);

}
