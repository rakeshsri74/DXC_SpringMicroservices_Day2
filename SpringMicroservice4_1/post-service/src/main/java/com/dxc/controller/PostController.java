package com.dxc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.CommentDto;
import com.dxc.model.Post;
import com.dxc.service.PostService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	PostService service;
	
	@GetMapping("/all")
	public List<Post> findAllPosts(){
		return service.findAllPosts();
	}
	
	@GetMapping("/author/{postId}")
	public String findAuthor(@PathVariable int postId) {
		return service.findAuthorByPostId(postId);
	}
	
	@GetMapping("/comments/{postId}")
	@HystrixCommand(fallbackMethod =  "getMe")
	public List<CommentDto> findCommentsByPostId(@PathVariable("postId") int postId){
		return service.findCommentByPost(postId);
	}
	
	public List<CommentDto> getMe(@PathVariable("postId") int postId){
		List<CommentDto> data = new ArrayList<>();
		data.add(new CommentDto(1111,"dummy1",2222,"This is sample1"));
		data.add(new CommentDto(2222,"dummy2",3333,"This is sample2"));
		System.out.println("Comment service is down");
	
		return data;
	}
		
}
