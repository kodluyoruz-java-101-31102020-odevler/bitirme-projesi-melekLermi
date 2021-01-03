package com.integration.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.integration.app.dto.AuthorDto;
import com.integration.app.model.entity.Author;

@Repository
public interface AuthorDao extends CrudRepository<Author, String> {		
	
	@Query("SELECT thatAuthor FROM Author thatAuthor WHERE thatAuthor.authorName LIKE %:thatAuthorName% ")
	public List<Author> findByAuthorName(@Param("thatAuthorName") String thatAuthorName);

	@Query("SELECT auth FROM Author thatAuthor WHERE thatAuthor.authorSurName LIKE %:thatAuthorSurname% ")
	public List<Author> findByAuthorSurname(@Param("thatAuthorSurname") String thatAuthorSurname);
	
	public Author save(Author author);

	public List<Author> search(String authorName);


}
