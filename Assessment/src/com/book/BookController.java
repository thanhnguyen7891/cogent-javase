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
public class BookController {
	BookService bService;
	Scanner sc = new Scanner(System.in);
	
	public BookController() {
		bService = new BookService();
	}
	
	public void accept(int choice) {
		String author;
		String title;
	
		switch (choice) {
		case 1: 
			bService.save();
			break;
			
		case 2:
			bService.fetch();
			break;
			
		case 3:
			System.out.println("Please enter book title: ");
			title = sc.next();
			bService.searchTitle(title);
		
		case 4:
			System.out.println("Please enter book author: ");
			author = sc.next();
			bService.searchAuthor(author);
			
		case 5:
			System.exit(choice);
			break;
		}
	}

}
