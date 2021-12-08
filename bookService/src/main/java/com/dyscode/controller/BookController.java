package com.dyscode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyscode.entity.Book;
import com.dyscode.service.BookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/")
	public Book createBook(@RequestBody Book book) {
		log.info("inside the createBook in BookController ");
		return bookService.save(book);
	}
	
	@GetMapping("/{id}")
	public Book findBookById(@PathVariable("id") Long bookId) {
		log.info("inside the findBookById in BookController ");
		return bookService.findBookById(bookId);
	}
	
	

}
