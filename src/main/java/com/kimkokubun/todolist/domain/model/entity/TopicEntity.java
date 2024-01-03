package com.kimkokubun.todolist.domain.model.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TopicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "up_votes", columnDefinition = "int default 0")
    private int upVotes;

    @Column(name = "donw_votes", columnDefinition = "int default 0")
    private int downVotes;

    @Column(name = "user_created")
    private String userCreated;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @Column(name = "user_update")
    private String userUpdate;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;

    @Column(name = "user_delete")
    private String userDelete;

    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime deletedAt;

    public TopicEntity(Long id, String name, String description, String label, int upVotes, int downVotes, String userCreated, LocalDateTime createdAt, String userUpdate, LocalDateTime updatedAt, String userDelete, LocalDateTime deletedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.label = label;
        this.upVotes = upVotes;
        this.downVotes = downVotes;
        this.userCreated = userCreated;
        this.createdAt = createdAt;
        this.userUpdate = userUpdate;
        this.updatedAt = updatedAt;
        this.userDelete = userDelete;
        this.deletedAt = deletedAt;
    }

    public TopicEntity() {
    }
}
