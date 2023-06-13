package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dxc.model.Comment;
import com.dxc.repo.CommentRepo;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepo repo;
	
	@Autowired
	private RestTemplate template; 

	@Override
	public List<Comment> findAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Comment> findCommentByPid(int pid) {
		// TODO Auto-generated method stub
		return repo.findCommentByPid(pid);
	}

	@Override
	public String findAuthor(int pid) {
		String url = "http://localhost:8800/posts/author/"+pid;
		return template.getForObject(url,String.class);
	}

}
