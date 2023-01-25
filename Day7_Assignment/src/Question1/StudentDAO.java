/**
 * 
 */
package Question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author : Thanh
 * @date   : Jan 23, 2023
 * 
 */
public class StudentDAO {
	private ArrayList<Student> arrStudent = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);	
	
	public void setNames() {
		System.out.println("How many student you want to create? ");
		int size = sc.nextInt();
		for(int i=0; i< size; i++) {
			System.out.println("Please enter student ID: ");
			int stuId = sc.nextInt();
			System.out.println("Please enter student name: ");
			String name = sc.next();
			System.out.println("Please enter student age: ");
			int age = sc.nextInt();
			
			Student stu = new Student(stuId, name, age);
			arrStudent.add(stu);
		}
		
	}
	public void searchName (String name) {
		for (Student s :arrStudent) {
			if(s.getName().compareTo(name) == 0) {
				System.out.println("Student found: "+ name);
			}
		}
		
	}
	public void searchName(int index) {
		if(arrStudent.get(index) != null) {
			System.out.println("Index found: "+ arrStudent.get(index).getName());
		} else {
			System.out.println("Not found index!!");
		}
		
	}
	public void printNames() {
		for(Student s : arrStudent) {
			System.out.println("Student ID is: "+s.getStuId());
			System.out.println("Student name is: "+ s.getName());
			System.out.println("Student age is: "+ s.getAge());
		}
		
	}
	public void removeName(String stuName) {
		Iterator<Student> remove = arrStudent.iterator();
		while(remove.hasNext()) {
			if(remove.next().getName().compareTo(stuName) == 0) {
				remove.remove();
				System.out.println("Student deleted!!");
			}
		}
	}
	
}
