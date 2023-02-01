/**
 * 
 */
package com.book;

/**
 * @author : Thanh
 * @date   : Feb 1, 2023
 * 
 */
public interface BookStoreDAO {
	public void addBook();
	
	public void searchByTitle(String title);
	
	public void searchByAuthor(String author);
	
	public void displayAll();
}
