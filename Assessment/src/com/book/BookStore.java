/**
 * 
 */
package com.book;

import java.util.Scanner;

/**
 * @author : Thanh
 * @date   : Feb 1, 2023
 * 
 */
public class BookStore implements BookStoreDAO {
	Book books[];
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void addBook() {
		System.out.println("How many book you want to add?");
		int size = sc.nextInt();
		books = new Book[size];
		for(int i=0; i<books.length; i++) {
			Book book = new Book();
			System.out.println("Please enter book ID start with B: ");
			String bookId = sc.next();
			System.out.println("Please enter book title: ");
			String title = sc.next();
			System.out.println("Please enter book author: ");
			String author = sc.next();
			System.out.println("Please enter book category: ");
			String category = sc.next();
			System.out.println("Please enter book price: ");
			Double price = sc.nextDouble();
			
			book.setBookId(bookId);
			book.setTitle(title);
			book.setAuthor(author);
			book.setCategory(category);
			book.setPrice(price);
			books[i] = book;
		}
		
	}
	
	public void validateInput(Book book) {
		if(book.getPrice()<0.0) {
			throw new InvalidBookException("Price cannot be negative");
		}
		if(book.getBookId().charAt(0) != 'B' || book.getBookId().length() !=4) {
			throw new InvalidBookException("Please enter valid book ID start with B: ");
		}
		if(book.getCategory().equalsIgnoreCase("Science")||
				book.getCategory().equalsIgnoreCase("Fiction")||
				book.getCategory().equalsIgnoreCase("Technology")||
				book.getCategory().equalsIgnoreCase("other")) {
			throw new InvalidBookException("Category must be “Science”, “Fiction”, “Technology” or “Others”");
		}
	}

	@Override
	public void searchByTitle(String title) {
		for( int i=0; i<books.length; i++) {
			if(title.equals(books[i].getTitle())) {
				System.out.println("Book ID is: "+ books[i].getBookId());
				System.out.println("Book title is: "+ books[i].getTitle());
				System.out.println("Book author is: "+ books[i].getAuthor());
				System.out.println("Book category is: "+ books[i].getCategory());
				System.out.println("Book price is: "+ books[i].getPrice());
			}
			else {
				System.out.println("Book not found!");
			}
		}
		
	}

	@Override
	public void searchByAuthor(String author) {
		for(int i=0; i<books.length; i++) {
			if(author.equals(books[i].getAuthor())) {
				System.out.println("Book ID is: "+ books[i].getBookId());
				System.out.println("Book title is: "+ books[i].getTitle());
				System.out.println("Book author is: "+ books[i].getAuthor());
				System.out.println("Book category is: "+ books[i].getCategory());
				System.out.println("Book price is: "+ books[i].getPrice());
			}
			else {
				System.out.println("Book not found!");
			}
		}
	}

	@Override
	public void displayAll() {
		for(Book b: books) {
			System.out.println(b.toString());
		}
		
	}
	
}
