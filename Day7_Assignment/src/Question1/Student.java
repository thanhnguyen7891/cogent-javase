/**
 * 
 */
package Question1;

/**
 * @author : Thanh
 * @date   : Jan 23, 2023
 * 
 */
public class Student {
	private int stuId;
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(int stuId, String name, int age) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.age = age;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
