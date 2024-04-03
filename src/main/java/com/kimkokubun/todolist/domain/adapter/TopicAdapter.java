package com.kimkokubun.todolist.domain.adapter;

import com.kimkokubun.todolist.domain.model.entity.TopicEntity;
import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.model.response.HistoricResponse;
import com.kimkokubun.todolist.domain.model.response.TopicResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TopicAdapter {

    public TopicEntity createEntityFromRequest(TopicRequest topic) {
        TopicEntity topicEntity = new TopicEntity();
        BeanUtils.copyProperties(topic, topicEntity);
        topicEntity.setCreatedAt(LocalDateTime.now());
        return topicEntity;
    }

    public void updateEntityFromRequest(TopicEntity topicEntity, TopicRequest topicRequest) {
        BeanUtils.copyProperties(topicRequest, topicEntity);
        topicEntity.setCreatedAt(LocalDateTime.now());
    }

    public TopicResponse convertEntityToResponse(TopicEntity topic) {
        return new TopicResponse(
                topic.getName(),
                topic.getDescription(),
                topic.getLabel(),
                topic.getColor(),
                topic.getPriority(),
                new HistoricResponse("usuario1", LocalDateTime.now())
        );
    }
}