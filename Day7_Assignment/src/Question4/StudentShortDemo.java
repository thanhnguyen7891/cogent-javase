/**
 * 
 */
package Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Thanh
 * @date   : Jan 24, 2023
 * 
 */
public class StudentShortDemo {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(666, "baba"));
		students.add(new Student(222, "dada"));
		students.add(new Student(999, "hehe"));
		students.add(new Student(444, "hihi"));
		students.add(new Student(111, "nono"));
		
		System.out.println("Original list: "+ students);
		
		Collections.sort(students);
		System.out.println("After sorted: "+ students);
	}

}
