package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.User;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<User> showUser(String username) {
		return new ResponseEntity<User>(userService.findByUsername(username), HttpStatus.OK);

	}

	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user) {
		System.out.println(user.toString());
		return new ResponseEntity<User>(userService.registerUser(user), HttpStatus.OK);
	}

	@PatchMapping("/update/{id}")
	public ResponseEntity<String> updatePassword(@PathVariable Long id, String password) {
		return new ResponseEntity<String>(userService.updatePassword(id, password), HttpStatus.OK);
	}
}
