/**
 * 
 */
package com.book;

/**
 * @author : Thanh
 * @date   : Feb 1, 2023
 * 
 */
public class BookService {
	BookStore bStore;
	
	public BookService() {
		bStore = new BookStore();
	}
	
	public void save() {
		bStore.addBook();
	}
	
	public void fetch() {
		bStore.displayAll();
		
	}
	
	public void searchTitle(String title) {
		bStore.searchByTitle(title);
	}
	
	public void searchAuthor(String author) {
		bStore.searchByAuthor(author);
	}

}
