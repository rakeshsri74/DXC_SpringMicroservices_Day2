package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Comment;
import com.dxc.service.CommentService;


@RestController
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	CommentService service;
	
	@GetMapping("/all")
	public List<Comment> findAllComments(){
		return service.findAllComments();
	}
	
	@GetMapping("/pid/{pid}")
	public List<Comment> findCommentsByPid(@PathVariable int pid){
		return service.findCommentByPid(pid);
	}
	
	@GetMapping("/post/author/{pid}")
	public String findAuthorForPid(@PathVariable int pid) {
		return service.findAuthor(pid);
	}
}
