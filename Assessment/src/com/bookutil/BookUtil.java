/**
 * 
 */
package com.bookutil;

import java.util.Scanner;

import com.book.BookController;

/**
 * @author : Thanh
 * @date   : Feb 1, 2023
 * 
 */
public class BookUtil {
	public static void main(String[] args) {
		int choice =0;
		Scanner sc = new Scanner(System.in);
		BookController bc = new BookController();
		System.out.println("Welcome to bookstore!!");
		do {
			System.out.println("1- Add a book");
			System.out.println("2- Search by title");
			System.out.println("3- Search by author");
			System.out.println("4- Display all book");
			System.out.println("5- Exit");
			System.out.println("Please enter your choice:");
			choice = sc.nextInt();
			bc.accept(choice);
			
		} while(choice !=5);
		sc.close();
	}
}
