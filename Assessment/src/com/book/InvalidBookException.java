/**
 * 
 */
package com.book;

/**
 * @author : Thanh
 * @date   : Feb 1, 2023
 * 
 */
public class InvalidBookException extends RuntimeException {
	
	public InvalidBookException(String errorMessage) {
		super(errorMessage);
	}
	

}
