package com.integration.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.integration.app.model.entity.Book;

public interface BookDao extends CrudRepository<Book, String> {

	@Query(value = "SELECT e FROM Book e WHERE e.name = :book_name")
	public Book findByBookname(String bookName);
	
}
