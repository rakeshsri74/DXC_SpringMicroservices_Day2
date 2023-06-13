package com.dxc.service;

import java.util.List;

import com.dxc.model.CommentDto;
import com.dxc.model.Post;

public interface PostService {

	public List<Post> findAllPosts();
	public String findAuthorByPostId(int postid);
	public List<CommentDto> findCommentByPost(int postid);
}
