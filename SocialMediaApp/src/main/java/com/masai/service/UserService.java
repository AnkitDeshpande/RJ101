package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.model.Comment;
import com.masai.model.Like;
import com.masai.model.Post;
import com.masai.model.User;
import com.masai.repo.CommentRepo;
import com.masai.repo.LikeRepo;
import com.masai.repo.PostRepo;
import com.masai.repo.UserRepo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private LikeRepo likeRepo;

	public User getUser(Long id) {
		try {
			return userRepo.findById(id).orElseThrow(() -> new Exception("No user Found"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public User addUser(User user) {
		return userRepo.save(user);
	}

	public Post addPost(Post post) {
		return postRepo.save(post);
	}

	public Like addLike(Like like) {
		return likeRepo.save(like);
	}

	public Comment addComment(Comment comment) {
		return commentRepo.save(comment);
	}

}
