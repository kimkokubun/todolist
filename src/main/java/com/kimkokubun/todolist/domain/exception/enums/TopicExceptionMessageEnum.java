package com.kimkokubun.todolist.domain.exception.enums;

import lombok.Getter;

@Getter
public enum TopicExceptionMessageEnum {
    TOPIC_NOT_FOUND("Topic not found.");

    private final String message;

    TopicExceptionMessageEnum(String message) {
        this.message = message;
    }

}
