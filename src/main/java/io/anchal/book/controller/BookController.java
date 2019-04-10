package io.anchal.book.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.anchal.book.entity.Book;
import io.anchal.book.repository.BookRepository;

@RestController
public class BookController {

	
	
	@Autowired
	private BookRepository bookRepository ;
	
	@GetMapping("/book/create")
	public Book create() {
		
		Book book= new Book("11100", "A1100", "JAVA", "XYZ", 2000.00, new Date());
		//return book;
		return bookRepository.save(book);
	}
}
