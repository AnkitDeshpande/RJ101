package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "Users")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	@NotBlank(message = "Full Name is required (First-Name && Last-Name).")
	@Size(min = 4, message = "Name must be at least 4 characters long.")
	private String fullName;

	@Column(unique = true)
	@NotBlank(message = "Username is required.")
	private String username;

	@JsonIgnore
	@NotBlank(message = "Password is required.")
	@Size(min = 6, message = "Password must be at least 6 characters long.")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).*$", message = "Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character (@, #, $, %, ^, &, +, =, !)")
	private String password;

	@NotBlank(message = "Phone number is required.")
	private String phone;

	@NotBlank(message = "Email is required.")
	@Email(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")
	private String email;

	private double wallet = 0.0;

	private boolean isDeleted = false;

	@JsonIgnore
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Review> reviews = new HashSet<Review>();

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user", orphanRemoval = true)
	private Set<Address> addresses = new HashSet<>();

	public User(
			@NotBlank(message = "Full Name is required (First-Name && Last-Name).") @Size(min = 4, message = "Name must be at least 4 characters long.") String fullName,
			@NotBlank(message = "Username is required.") String username,
			@NotBlank(message = "Password is required.") @Size(min = 6, message = "Password must be at least 6 characters long.") @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).*$", message = "Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character (@, #, $, %, ^, &, +, =, !)") String password,
			@NotBlank(message = "Phone number is required.") String phone,
			@NotBlank(message = "Email is required.") @Email(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$") String email) {
		super();
		this.fullName = fullName;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

}
