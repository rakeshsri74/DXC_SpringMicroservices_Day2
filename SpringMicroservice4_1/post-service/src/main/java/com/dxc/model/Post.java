package com.dxc.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {

	@Id
	private int pid;
	private String author;
	private String description;
	private String title;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int pid, String author, String description, String title) {
		super();
		this.pid = pid;
		this.author = author;
		this.description = description;
		this.title = title;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Post [pid=" + pid + ", author=" + author + ", description=" + description + ", title=" + title + "]";
	}
	
	
	
	
}
