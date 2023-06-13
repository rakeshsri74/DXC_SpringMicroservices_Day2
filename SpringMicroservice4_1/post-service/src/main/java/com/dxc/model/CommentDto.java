package com.dxc.model;

public class CommentDto {

	private int cid;
	private String commenter;
	private int pid;
	private String comment;
	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommentDto(int cid, String commenter, int pid, String comment) {
		super();
		this.cid = cid;
		this.commenter = commenter;
		this.pid = pid;
		this.comment = comment;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", commenter=" + commenter + ", pid=" + pid + ", comment=" + comment + "]";
	}
	
	
}
