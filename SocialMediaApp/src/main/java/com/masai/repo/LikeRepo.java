package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Like;
@Repository
public interface LikeRepo extends JpaRepository<Like, Long> {

}
