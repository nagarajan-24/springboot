package com.example.demo.Model;



public class BookModel {
	
	private int bookId;
	private String bookName;
	private String author;
	private int price;
	private String description;
	public BookModel() {}
	public BookModel(int bookId, String bookName, String author, int price, String description) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.description = description;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "BookModel [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", description=" + description + "]";
	}
	

}
