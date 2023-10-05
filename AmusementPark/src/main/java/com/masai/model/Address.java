package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table(name = "Addresses")
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "City is required.")
	private String city;

	@NotBlank(message = "State is required.")
	private String state;

	@NotBlank(message = "Pincode is required.")
	@Pattern(regexp = "\\d{6}", message = "Pincode must be a 6-digit number.")
	private String pincode;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Address(@NotBlank(message = "City is required.") String city,
			@NotBlank(message = "State is required.") String state,
			@NotBlank(message = "Pincode is required.") @Pattern(regexp = "\\d{6}", message = "Pincode must be a 6-digit number.") String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

}
