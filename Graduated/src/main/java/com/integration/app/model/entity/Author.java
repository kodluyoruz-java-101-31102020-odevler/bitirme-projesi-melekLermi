package com.integration.app.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "authors")
public class Author implements Serializable {
	
	private static final long serialVersionUID = -82439648328404424L;

	@Id
	@GeneratedValue
	@Column(name = "author_id")
	private String authorId;
	
	@Column(name = "author_name")
	private String authorName;
	
	@Column(name = "author_surname")
	private String authorSurname;
	
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private Set<Book> book;

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}

	
}
