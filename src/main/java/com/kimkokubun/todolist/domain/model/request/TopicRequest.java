package com.kimkokubun.todolist.domain.model.request;

public class TopicRequest {
    String name;
    String description;
    String label;
    String color;
    Integer priority;
    Integer upvote;
    Integer dwvote;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getUpvote() {return upvote;}

    public Integer getDwvote() {
        return dwvote;
    }
}
