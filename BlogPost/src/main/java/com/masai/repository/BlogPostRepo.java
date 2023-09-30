package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.BlogPost;

@Repository
public interface BlogPostRepo extends JpaRepository<BlogPost, Long> {

}
