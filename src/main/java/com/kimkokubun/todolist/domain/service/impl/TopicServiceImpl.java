package com.kimkokubun.todolist.domain.service.impl;

import com.kimkokubun.todolist.domain.adapter.TopicAdapter;
import com.kimkokubun.todolist.domain.exception.DataNotFoundException;
import com.kimkokubun.todolist.domain.exception.enums.TopicExceptionMessageEnum;
import com.kimkokubun.todolist.domain.model.entity.TopicEntity;
import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.model.response.TopicResponse;
import com.kimkokubun.todolist.domain.repository.TopicRepository;
import com.kimkokubun.todolist.domain.service.TopicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicServiceImpl implements TopicService {

    private final TopicAdapter topicAdapter;
    private final TopicRepository topicRepository;

    public TopicServiceImpl(TopicAdapter topicAdapter, TopicRepository topicRepository) {
        this.topicAdapter = topicAdapter;
        this.topicRepository = topicRepository;
    }

    @Override
    public TopicResponse addTopic(TopicRequest topicRequest) {
        TopicEntity topicEntity = topicAdapter.createEntityFromRequest(topicRequest);
        topicRepository.save(topicEntity);
        return topicAdapter.convertEntityToResponse(topicEntity);
    }

    @Override
    public TopicResponse updateTopic(Long idTopic, TopicRequest topicRequest) {
        TopicEntity topic = topicRepository.findById(idTopic)
                .orElseThrow(() -> new DataNotFoundException(TopicExceptionMessageEnum.TOPIC_NOT_FOUND.getMessage()));

        topicAdapter.updateEntityFromRequest(topic, topicRequest);
        topicRepository.save(topic);
        return topicAdapter.convertEntityToResponse(topic);
    }
    @Override
    public TopicResponse getTopic(Long idTopic) {
        return topicRepository.findById(idTopic).map(topicAdapter::convertEntityToResponse).orElseThrow(() -> new DataNotFoundException(TopicExceptionMessageEnum.TOPIC_NOT_FOUND.getMessage()));
    }

    @Override
    public List<TopicResponse> getAllTopics() {
        return topicRepository.findAll().stream().map(topicAdapter::convertEntityToResponse).collect(Collectors.toList());
    }

    @Override
    public void deleteTopic(Long idTopic) {
        topicRepository.findById(idTopic)
                .ifPresentOrElse(
                        topic -> topicRepository.deleteById(idTopic),
                        () -> { throw new DataNotFoundException(TopicExceptionMessageEnum.TOPIC_NOT_FOUND.getMessage()); }
                );
        }
}
