package com.integration.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.integration.app.model.entity.Book;

@Service
public interface BookService {
	
	public Book save(Book book);

	public List<Book> findByBookName(String bookName);

	public List<Book> getAllBook();

}
