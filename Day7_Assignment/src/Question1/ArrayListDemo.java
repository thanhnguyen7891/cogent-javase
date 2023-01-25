/**
 * 
 */
package Question1;

/**
 * @author : Thanh
 * @date   : Jan 23, 2023
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		StudentDAO student = new StudentDAO();
		
		student.setNames();
		student.printNames();
		student.searchName(null);
		student.searchName(0);
		student.printNames();
		student.removeName(null);
	}

}
