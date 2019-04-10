package io.anchal.book.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.anchal.book.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {

	
	
}
