package com.myblog.myblog161.repository;

import com.myblog.myblog161.controller.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
