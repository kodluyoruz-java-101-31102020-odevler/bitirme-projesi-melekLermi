package com.integration.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integration.app.model.entity.Author;
import com.integration.app.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value = "/api/author/save", method = RequestMethod.POST)
	public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
		Author auth = authorService.save(author);
		if (auth != null) {
			return new ResponseEntity<Author>(auth, HttpStatus.OK);
		} else {
			return new ResponseEntity<Author>(auth, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
}

