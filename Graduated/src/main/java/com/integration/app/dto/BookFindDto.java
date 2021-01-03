package com.integration.app.dto;

import java.util.List;

public class BookFindDto {

	private String bookName;
	
	private List<String> authors;
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
}
