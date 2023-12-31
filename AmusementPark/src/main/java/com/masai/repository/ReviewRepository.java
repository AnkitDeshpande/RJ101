package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
