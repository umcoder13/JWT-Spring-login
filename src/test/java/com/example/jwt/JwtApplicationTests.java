package com.example.jwt;

import com.example.jwt.dto.PageResponseDto;
import com.example.jwt.entity.Article;
import com.example.jwt.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceContext;
import java.util.List;

@SpringBootTest
@Transactional
class JwtApplicationTests {

	@Autowired
	ArticleRepository repository;

	@Test
	void contextLoads() {
		Page<Article> articles = repository.findAll(PageRequest.of(1, 10));
		for (Article article: articles) {
			System.out.println(article.getMember().getNickname());
		}
	}

	@Test
	public void querydsl() throws Exception {
		Page<PageResponseDto> dtos = repository.searchAll(PageRequest.of(1, 10));
		for (PageResponseDto dto: dtos) {
			System.out.println(dto.getMemberNickname());
		}

	}

}
