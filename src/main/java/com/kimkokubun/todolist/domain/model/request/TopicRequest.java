package com.kimkokubun.todolist.domain.model.request;


public record TopicRequest(
        String name,
        String description,
        String label,
        String color,
        Integer priority
) {

    public TopicRequest(String name, String label) {
        this(name, null, label, null, null);
    }
}