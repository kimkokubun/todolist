package com.kimkokubun.todolist.domain.model.response;

import java.time.LocalDateTime;

public class HistoricResponse {

    String user;
    LocalDateTime createdAt;
    String userUpdate;
    LocalDateTime updatedAt;
    String userDelete;
    LocalDateTime deletedAt;

    public HistoricResponse() {
    }

    public HistoricResponse(String user, LocalDateTime createdAt) {
        this.user = user;
        this.createdAt = createdAt;
    }

    public HistoricResponse(String user, LocalDateTime createdAt, String userUpdate, LocalDateTime updatedAt) {
        this.user = user;
        this.createdAt = createdAt;
        this.userUpdate = userUpdate;
        this.updatedAt = updatedAt;
    }

    public HistoricResponse(String user, LocalDateTime createdAt, String userUpdate, LocalDateTime updatedAt, String userDelete, LocalDateTime deletedAt) {
        this.user = user;
        this.createdAt = createdAt;
        this.userUpdate = userUpdate;
        this.updatedAt = updatedAt;
        this.userDelete = userDelete;
        this.deletedAt = deletedAt;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(String userDelete) {
        this.userDelete = userDelete;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
}
