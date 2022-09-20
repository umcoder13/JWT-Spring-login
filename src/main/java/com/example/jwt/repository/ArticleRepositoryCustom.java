package com.example.jwt.repository;

import com.example.jwt.dto.PageResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ArticleRepositoryCustom {
    Page<PageResponseDto> searchAll(Pageable pageable);
}
