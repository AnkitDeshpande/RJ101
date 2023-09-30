package com.masai.service;

import com.masai.exception.SomethingWentWrongException;
import com.masai.model.BlogPost;

public interface BlogPostService {

	BlogPost createBlog(BlogPost blog) throws SomethingWentWrongException;
}
