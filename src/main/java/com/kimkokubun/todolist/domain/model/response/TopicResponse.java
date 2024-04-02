package com.kimkokubun.todolist.domain.model.response;

import org.hibernate.annotations.ManyToAny;

public record TopicResponse(
        String name,
        String description,
        String label,
        String color,
        Integer priority,
        @ManyToAny
        HistoricResponse historicResponse
) {
}
