package com.kimkokubun.todolist.config;

import org.springframework.http.HttpStatus;

public record RestErrorMessage (
    HttpStatus status,
    String message
){}
