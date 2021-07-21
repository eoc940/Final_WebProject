package com.tracycle.recycle.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private int boardId;
	private String title;
	private String content;
	private String date;
	private int viewCount;
	private int status;
	
	private UserVO user;
	private AreaVO area;
	private CategoryVO category;
	List<MultipartFile> files;
	
	
	public BoardVO() { }


	public BoardVO(int boardId, String title, String content, String date, int viewCount, int status) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.date = date;
		this.viewCount = viewCount;
		this.status = status;
	}


	public BoardVO(int boardId, String title, String content, String date, int viewCount, int status, UserVO user,
			AreaVO area, CategoryVO category, List<MultipartFile> files) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.date = date;
		this.viewCount = viewCount;
		this.status = status;
		this.user = user;
		this.area = area;
		this.category = category;
		this.files = files;
	}


	public int getBoardId() {
		return boardId;
	}


	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getViewCount() {
		return viewCount;
	}


	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public UserVO getUser() {
		return user;
	}


	public void setUser(UserVO user) {
		this.user = user;
	}


	public AreaVO getArea() {
		return area;
	}


	public void setArea(AreaVO area) {
		this.area = area;
	}


	public CategoryVO getCategory() {
		return category;
	}


	public void setCategory(CategoryVO category) {
		this.category = category;
	}


	public List<MultipartFile> getFiles() {
		return files;
	}


	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}


	@Override
	public String toString() {
		return "BoardVO [boardId=" + boardId + ", title=" + title + ", content=" + content + ", date=" + date
				+ ", viewCount=" + viewCount + ", status=" + status + ", user=" + user + ", area=" + area
				+ ", category=" + category + ", files=" + files + "]";
	}
	
	
	
	
	
}