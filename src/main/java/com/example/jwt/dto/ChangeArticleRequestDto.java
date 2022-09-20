package com.example.jwt.dto;

import lombok.Getter;

@Getter
public class ChangeArticleRequestDto {
    private Long id;
    private String title;
    private String body;
}
