package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.BookModel;
import com.example.demo.Repository.BookRepo;

@Service
public class BookService {
	
	
//	List <BookModel>model=new ArrayList<>(Arrays.asList(new BookModel(1,"The Great Gatsby","F. Scott Fitzgerald",299,"A classic novel set in the Roaring Twenties."),
//			new BookModel(2, "1984", "George Orwell", 199, "A dystopian novel about totalitarianism."),
//			new BookModel(3, "To Kill a Mockingbird", "Harper Lee", 249, "A novel about racial injustice in the Deep South."),
//			new BookModel(4, "Pride and Prejudice", "Jane Austen", 179, "A romantic novel about manners and marriage."),
//			new BookModel(5, "The Hobbit", "J.R.R. Tolkien", 349, "A fantasy adventure before the events of The Lord of the Rings.")));
//	
	@Autowired
	BookRepo repo;
	public List<BookModel> getAllBooks(){
		return repo.findAll();
	}

	public BookModel getBookById(int bId) {
		return repo.getById(bId);
	}

	public void addBook(BookModel m) {
		repo.save(m);
		
	}

	public void updateBook(BookModel m) {
	repo.save(m);
	}

	public void deleteBook(int bId) {
		repo.deleteById(bId);
	}
}
