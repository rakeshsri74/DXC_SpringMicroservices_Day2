package com.dxc.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dxc.model.CommentDto;

@FeignClient(name="comment-service")
public interface PostFeignProxy {

	@GetMapping("comments/pid/{pid}")
	public List<CommentDto> findCommentsByPid(@PathVariable int pid);
}
