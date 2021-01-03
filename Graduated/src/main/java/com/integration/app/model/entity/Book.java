package com.integration.app.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private String bookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "book_description")
	private String bookDescription;
	
	@Column(name = "book_note")
	private String bookNote;
	
	@Column(name = "year_printing")
	@Temporal(TemporalType.DATE)
	private Date yearPrinting;
	
	@Column(name = "book_page")
	private String bookPage;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id", nullable = false)
	private Author author;
	

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
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

	public Date getYearPrinting() {
		return yearPrinting;
	}

	public void setYearPrinting(Date yearPrinting) {
		this.yearPrinting = yearPrinting;
	}

	public String getBookPage() {
		return bookPage;
	}

	public void setBookPage(String bookPage) {
		this.bookPage = bookPage;
	}

	public void setAuthor(Object findByAuthorId) {
	}
	
	
}
