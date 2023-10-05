package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "Activities")
@Data
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Name is required.")
	private String name;

	@NotBlank(message = "Description is required.")
	private String description;

	@DecimalMin(value = "0.0", message = "Ticket price must be a non-negative value.")
	private double price;

	private boolean isDeleted = false;

	@OneToMany(mappedBy = "activity", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Review> reviews = new HashSet<Review>();

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "park_id")
	private Park park;

	public Activity(@NotBlank(message = "Name is required.") String name,
			@NotBlank(message = "Description is required.") String description,
			@DecimalMin(value = "0.0", message = "Ticket price must be a non-negative value.") double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

}
