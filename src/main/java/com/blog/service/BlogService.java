package com.blog.service;

import com.blog.domain.Article;
import com.blog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final 붙거나, @NotNull 붙은 필드의 생성자 추가
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    // 블로그 글 추가 메소드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
