package com.integration.app.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integration.app.aop.annonation.MethodRunningTime;
import com.integration.app.dao.BookDao;
import com.integration.app.model.entity.Book;
import com.integration.app.service.BookService;

@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Transactional
	public Book save(Book book) {
		if (book != null) {
			return bookDao.save(book);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Book> findByBookName(String bookName) {
		if (bookName != null) {
			return (List<Book>) bookDao.findByBookname(bookName);
		} else {
			return null;
		}
	}

	@MethodRunningTime(active = true)
	public List<Book> getAllBook() {

		return (List<Book>) bookDao.findAll();
	}
}
