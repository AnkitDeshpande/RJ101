package com.masai.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.DecimalMin;
import lombok.Data;

@Entity
@Table(name = "Tickets")
@Data
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "park_id")
	private Park park;

	@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate;

	@DecimalMin(value = "0.0", message = "Ticket price must be a non-negative value.")
	private double price;

	private boolean isCancelled = false;

	@PrePersist
	protected void onCreate() {
		purchaseDate = new Date(); // Set the purchaseDate to the current timestamp when the entity is created
	}

	public Ticket() {
	}

	public Ticket(User user, Park park, double price) {
		this.user = user;
		this.park = park;
		this.price = price;
	}

}
