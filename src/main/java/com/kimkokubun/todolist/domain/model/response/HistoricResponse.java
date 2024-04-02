package com.kimkokubun.todolist.domain.model.response;

import java.time.LocalDateTime;

public record HistoricResponse(
        String user,
        LocalDateTime createdAt,
        String userUpdate,
        LocalDateTime updatedAt,
        String userDelete,
        LocalDateTime deletedAt
) {

    public HistoricResponse(String user, LocalDateTime createdAt) {
        this(user, createdAt, null, null, null, null);
    }

}