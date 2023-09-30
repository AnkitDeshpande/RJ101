package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.SomethingWentWrongException;
import com.masai.model.User;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;

	@Override
	public User registerUser(User user) {
		System.out.println(user.toString());
		return repo.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return repo.findByUsername(username);
	}

	@Override
	public String updatePassword(Long id, String password) throws SomethingWentWrongException {
		User user = repo.findById(id).orElseThrow(() -> new SomethingWentWrongException("User not found"));

		user.setPassword(password);
		repo.save(user);
		return "Updated successfully";
	}

}
