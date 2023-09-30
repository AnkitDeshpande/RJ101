package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.model.BlogPost;
import com.masai.repository.BlogPostRepo;

@Service
public class BlogPostServiceImpl implements BlogPostService {

	private BlogPostRepo repo;

	@Override
	public BlogPost createBlog(BlogPost blog) {
		return repo.save(blog);
	}

}
