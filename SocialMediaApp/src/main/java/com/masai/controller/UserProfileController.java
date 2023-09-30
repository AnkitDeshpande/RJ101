package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Comment;
import com.masai.model.Like;
import com.masai.model.Post;
import com.masai.model.User;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/profile")
public class UserProfileController {

	@Autowired
	private UserService serv;

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id) {
		return new ResponseEntity<User>(serv.getUser(id), HttpStatus.OK);

	}

	@PostMapping("/users")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<User>(serv.addUser(user), HttpStatus.OK);
	}

	@PostMapping("/posts")
	public ResponseEntity<Post> addPost(@RequestBody Post post) {
		return new ResponseEntity<Post>(serv.addPost(post), HttpStatus.OK);
	}

	@PostMapping("/likes")
	public ResponseEntity<Like> addLike(@RequestBody Like like) {
		return new ResponseEntity<Like>(serv.addLike(like), HttpStatus.OK);
	}

	@PostMapping("/comments")
	public ResponseEntity<Comment> addComments(@RequestBody Comment comment) {
		return new ResponseEntity<Comment>(serv.addComment(comment), HttpStatus.OK);
	}
}
