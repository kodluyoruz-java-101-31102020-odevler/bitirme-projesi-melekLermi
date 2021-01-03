package com.integration.app.service.impl;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integration.app.dao.AuthorDao;
import com.integration.app.dao.impl.AuthorHibernateDaoImpl;
import com.integration.app.dto.AuthorDto;
import com.integration.app.model.entity.Author;
import com.integration.app.service.AuthorService;

@Service("authorServiceImpl")
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorDao authorDao;

	@Transactional
	public Author save(Author author) {

		if (author != null) {
			return authorDao.save(author);
		}else {
			return null;
		}
	}

	public List<Author> getAllAuthor() {
		
		return (List<Author>) authorDao.findAll();
	}


	@SuppressWarnings("unchecked")
	public List<Author> search(String authorName) {
		List<Author> results = null;
		if (authorName != null && (authorName.trim().length() > 0)) {
			results = (List<Author>) authorDao.search(authorName);
		} else {
			results = search(authorName);
		}

		return results;	}
	
}
