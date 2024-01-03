package com.kimkokubun.todolist.domain.service;

import com.kimkokubun.todolist.domain.model.request.TopicRequest;
import com.kimkokubun.todolist.domain.model.response.TopicResponse;

public interface TopicService {

    TopicResponse addTask(TopicRequest task);
}
