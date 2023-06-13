package com.dxc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dxc.model.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {

	@Query("select c from Comment c where c.pid=?1")//jpql
	public List<Comment> findCommentByPid(int pid);
}
