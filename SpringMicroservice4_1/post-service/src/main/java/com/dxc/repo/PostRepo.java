package com.dxc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dxc.model.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

	@Query("select p.author from Post p where p.pid=?1")
	public String findAuthor(int postId);
}
