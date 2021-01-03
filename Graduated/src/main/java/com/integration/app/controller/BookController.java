package com.integration.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.integration.app.model.entity.Book;
import com.integration.app.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/api/book/save", method = RequestMethod.POST)
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.save(book), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/book/search", method = RequestMethod.GET)
	public ResponseEntity<List<Book>> searchBookByName1(@RequestParam String bookName) {
		return new ResponseEntity<List<Book>>(bookService.findByBookName(bookName), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/book/search/name", method = RequestMethod.GET)
	public List<Book> searchBookByName(@RequestParam String bookName) {
		return bookService.findByBookName(bookName);
	}
	
}
