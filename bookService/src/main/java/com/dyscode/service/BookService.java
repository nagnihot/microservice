package com.dyscode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyscode.entity.Book;
import com.dyscode.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	public Book save(Book book) {
		log.info("inside book service method");
		return bookRepo.save(book);
	}

	public Book findBookById(Long bookId) {
		return bookRepo.findById(bookId).get();
	}
	
	
}
