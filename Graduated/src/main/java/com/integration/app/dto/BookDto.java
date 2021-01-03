package com.integration.app.dto;

import java.util.Date;
import java.util.List;

public class BookDto {

	private String bookID;
	
	private String bookName;
	
	private String bookDescription;
	
	private String bookNote;
	
	private String bookPage;
	
	private Date yearPrinting;
	
	private List<String> authors;
	
	public String getBookID() {
		return bookID;
	}
	
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookDescription() {
		return bookDescription;
	}
	
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	
	public String getBookNote() {
		return bookNote;
	}
	
	public void setBookNote(String bookNote) {
		this.bookNote = bookNote;
	}
	
	public String getBookPage() {
		return bookPage;
	}
	
	public void setBookPage(String bookPage) {
		this.bookPage = bookPage;
	}
	
	public Date getYearPrinting() {
		return yearPrinting;
	}
	
	public void setYearPrinting(Date yearPrinting) {
		this.yearPrinting = yearPrinting;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	
}
