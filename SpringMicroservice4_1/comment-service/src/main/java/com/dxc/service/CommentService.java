package com.dxc.service;

import java.util.List;

import com.dxc.model.Comment;

public interface CommentService {

	public List<Comment> findAllComments();
	public List<Comment> findCommentByPid(int pid);
	public String findAuthor(int pid);
}
