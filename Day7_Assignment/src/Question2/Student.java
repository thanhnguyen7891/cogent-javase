/**
 * 
 */
package Question2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Thanh
 * @date   : Jan 24, 2023
 * 
 */
public class Student {
	private String rollNo;
	private String name;
	private HashMap<String, String> empNames  = new HashMap<>();
	Scanner sc = new Scanner(System.in);	
	
	public Student() {
		
	}
	
	public void setNames() {
		System.out.println("Enter roll number: ");
		String rollNo = sc.next();
		System.out.println("Enter name: ");
		String name = sc.next();
		empNames.put(rollNo, name);
	}
	
	public void printNames() {
		Collection<String> name = empNames.values();
		System.out.println("Student names: ");
	}
	
	public void getName( String key) {
		System.out.println("Name: "+ empNames.get(key));
		
	}
	
	public void printNamesKeySet() {
		Set<String> set = empNames.keySet();
		for(String s : set) {
			System.out.println("Number: "+ s+" Name: "+ empNames.get(set));
		}
	}
	
	public void printSize() {
		System.out.println("Size: "+ empNames.size());
		
	}
	
	public void remove( String key) {
		System.out.println("Delete: "+ empNames.remove(key));
		
	}

}
