/**
 * 
 */
package Language;

import java.util.Scanner;
import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 * @author : Thanh
 * @date   : Feb 1, 2023
 * 
 */
public class TestClient {
	public static void main(String[] args) {
		
		CLang cl = new CLang();
		JavaLang jl = new JavaLang();
		
		Thread threadC = new Thread(cl);
		Thread threadJava = new Thread(jl);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please choose a language you want to see first: ");
		System.out.println("1- C language");
		System.out.println("2- Java language");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			threadC.setPriority(MAX_PRIORITY);
			threadJava.setPriority(MIN_PRIORITY);
			threadC.start();
			threadJava.start();
			break;
			
		case 2:
			threadC.setPriority(MIN_PRIORITY);
			threadJava.setPriority(MAX_PRIORITY);
			threadC.start();
			threadJava.start();
			break;
		}
	}
}
