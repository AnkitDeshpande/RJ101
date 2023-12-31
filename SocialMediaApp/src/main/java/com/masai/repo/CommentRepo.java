package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long>{

}
