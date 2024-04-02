package com.kimkokubun.todolist.domain.model.entity;


import com.kimkokubun.todolist.domain.model.response.HistoricResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "color")
    private String color;

    @Column(name = "priority", nullable = false)
    private Integer priority;

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


    public TopicEntity(Long id, String name, String label) {
        this.id = id;
        this.name = name;
        this.label = label;
    }

}

