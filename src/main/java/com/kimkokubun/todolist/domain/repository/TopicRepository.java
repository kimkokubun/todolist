package com.kimkokubun.todolist.domain.repository;

import com.kimkokubun.todolist.domain.model.entity.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<TopicEntity, Long> {
}
