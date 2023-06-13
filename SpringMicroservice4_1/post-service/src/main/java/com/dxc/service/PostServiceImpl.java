package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dxc.model.CommentDto;
import com.dxc.model.Post;
import com.dxc.repo.PostRepo;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepo repo;
	
	@Autowired
	PostFeignProxy template;
	
	@Override
	public List<Post> findAllPosts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String findAuthorByPostId(int postid) {
		// TODO Auto-generated method stub
		return repo.findAuthor(postid);
	}

	@Override
	public List<CommentDto> findCommentByPost(int postid) {
		
		List<CommentDto> comments = template.findCommentsByPid(postid);
		return comments;
	}

}
