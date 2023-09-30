package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.BlogPost;
import com.masai.service.BlogPostService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/blogs")
public class BlogPostController {
	@Autowired
	private BlogPostService blogService;

	@GetMapping
	public ResponseEntity<String> showBlogs() {
		return null;

	}

	@PostMapping("/create")
	public ResponseEntity<BlogPost> createBlog(@RequestBody BlogPost blog) {
		return new ResponseEntity<BlogPost>(blogService.createBlog(blog), HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateBlog(@RequestBody BlogPost blog, @PathVariable Long BlogId) {
		return null;
	}
}
