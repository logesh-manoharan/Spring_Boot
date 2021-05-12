package com.example.Springwithmongodb.resource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springwithmongodb.model.Book;
import com.example.Springwithmongodb.repository.BookRepository;

import java.util.*;

@RestController
public class BookController {
	@Autowired
	private BookRepository repository;
	
	@PostMapping("/addBook")
	private String AddBook(@RequestBody Book book) {
		repository.save(book);
		return "New book added wth id: "+book.getId();
	}
	
	@GetMapping("/getBooks")
	private List<Book> ReteriveBooks() {	
		return repository.findAll();
	}
	
	@GetMapping("/getBook/{id}")
	private Optional<Book> ReteriveBook(@PathVariable int id) {
		return repository.findById(id);
	}
	
	
	@DeleteMapping("/deleteBook/{id}")
	private String DeleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "Succesfully deleted the book with id: "+id;
	}
}
