package com.integration.app.dao.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.integration.app.aop.annonation.MethodRunningTime;
import com.integration.app.dao.AuthorDao;
import com.integration.app.dto.AuthorDto;
import com.integration.app.model.entity.Author;

@Repository("authorHibernateDaoImpl")
@Component
public class AuthorHibernateDaoImpl implements AuthorDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Author> findByAuthorName() {
		
		Session session = sessionFactory.openSession(); 
		
		Query<Author> query = session.createQuery("SELECT author_name FROM Author author_name", Author.class);
		List<Author> result = query.getResultList();
		
		session.close();
		return result;
	}	

	public List<Author> findByAuthorSurname() {
		
		Session session = sessionFactory.openSession(); 
		Query<Author> query = session.createQuery("SELECT author_surname FROM Author author_surname", Author.class);
		List<Author> result = query.getResultList();
	
		session.close();
		return result;
	}	

	public Author save(Author author) {
	
		Session session = sessionFactory.openSession(); 
		session.save(author);
		session.close();
		return author;
	}

	public <S extends Author> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Author> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Author> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Author> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Author entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Author> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public List<Author> findByAuthorName(String thatAuthorName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Author> findByAuthorSurname(String thatAuthorSurname) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Author> search(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}



}
