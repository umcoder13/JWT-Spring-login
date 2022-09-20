package com.example.jwt.dto;

import lombok.Getter;

@Getter
public class CreateArticleRequestDto {
    private String title;
    private String body;
}
