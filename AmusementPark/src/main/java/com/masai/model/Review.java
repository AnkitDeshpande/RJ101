package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "reviews")
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "park_id")
	private Park park;

	@ManyToOne
	@JoinColumn(name = "activity_id")
	private Activity activity;

	@NotBlank(message = "Rating is required.")
	@Min(value = 1, message = "Rating must be between 1 and 5 stars.")
	@Max(value = 5, message = "Rating must be between 1 and 5 stars.")
	private Integer rating;

	@NotNull(message = "Comment is required.")
	private String comment;

	private boolean isDeleted = false;
	
	
}
