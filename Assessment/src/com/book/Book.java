/**
 * 
 */
package com.book;

/**
 * @author : Thanh
 * @date   : Feb 1, 2023
 * 
 */
public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private Double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Book(String bookId, String title, String author, String category, Double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	

}
