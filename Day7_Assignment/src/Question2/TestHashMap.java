/**
 * 
 */
package Question2;


/**
 * @author : Thanh
 * @date   : Jan 24, 2023
 * 
 */
public class TestHashMap {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setNames();
		student.printNames();
		student.printNamesKeySet();
		student.printSize();
		student.remove(null);
		student.getName("Thanh");
	}

}
