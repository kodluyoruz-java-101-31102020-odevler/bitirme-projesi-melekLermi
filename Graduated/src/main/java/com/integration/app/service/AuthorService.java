package com.integration.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.integration.app.model.entity.Author;

@Service
public interface AuthorService {

	public Author save(Author author);
	
	public List<Author> getAllAuthor();
	
	public List<Author> search(String authorName);
	

}
