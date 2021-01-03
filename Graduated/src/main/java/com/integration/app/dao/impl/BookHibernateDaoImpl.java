package com.integration.app.dao.impl;

import java.util.ArrayList;
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
import com.integration.app.dao.BookDao;
import com.integration.app.model.entity.Book;

@Repository("bookHibernateDaoImpl")
@Component
public class BookHibernateDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	@MethodRunningTime( active = true)
	public Book findByBookname(String bookName) {
		List<Book> books = new ArrayList<Book>();
		
		return (Book) books;
	}
	
	
	public Book findByBookId(String bookId) {
		
		Session session = sessionFactory.openSession();
		
		Query<Book> query = session.createQuery("select e from Book e where bookId = :bookId", Book.class);
		query.setParameter("bookId", bookId);
		
		return query.getSingleResult();
	}



	public <S extends Book> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	public Optional<Book> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}


	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public Iterable<Book> findAllById(Iterable<String> ids) {
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


	public void delete(Book entity) {
		// TODO Auto-generated method stub
		
	}


	public void deleteAll(Iterable<? extends Book> entities) {
		// TODO Auto-generated method stub
		
	}


	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
