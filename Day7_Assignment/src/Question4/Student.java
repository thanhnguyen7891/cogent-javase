/**
 * 
 */
package Question4;


/**
 * @author : Thanh
 * @date   : Jan 24, 2023
 * 
 */
public class Student {
	private int rollNo;
	private String name;
	
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int compareTo(Student o) {
		if(this.name.length() < o.getName().length()) {
			return -1;
		}else if (this.name.length() == o.getName().length()) {
			return 0;
		} else {
			return 1;
		}
		
	}
	@Override
	public String toString() {
		return "Student roll number: "+ this.rollNo+ "Student name: "+ this.name;
	}
	

}
