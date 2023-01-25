/**
 * 
 */
package Question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author : Thanh
 * @date   : Jan 24, 2023
 * 
 */
public class Main {

	public static void main(String[] args) {
		String students[] = {"baba","mama","hihi","hehe","hoho"};
		
		Arrays.sort(students, new Student());
		System.out.println(Arrays.toString(students));
	}

}
