package com.masai.service;

import com.masai.exception.SomethingWentWrongException;
import com.masai.exception.UserNotFoundException;
import com.masai.model.User;

public interface UserService {
	User registerUser(User user) throws SomethingWentWrongException;

	User findByUsername(String username) throws UserNotFoundException;

	String updatePassword(Long userId, String password) throws SomethingWentWrongException;
}
