package com.example.demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.BookModel;
import com.example.demo.Service.BookService;

@RestController
@RequestMapping("/api")
public class BookControler {
	
	@Autowired
	BookService service;

	@GetMapping("/books")
	public List<BookModel> getBooks() {
		return service.getAllBooks();
	}
	@GetMapping("/books/{bId}")
	public BookModel getBookById(@PathVariable int bId) {
		return service.getBookById(bId);
	}
	@PostMapping("/books")
	public void addBook(@RequestBody BookModel model) {
		service.addBook(model);
		System.out.println(model);
	}
}
