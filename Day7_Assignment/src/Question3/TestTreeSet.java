/**
 * 
 */
package Question3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author : Thanh
 * @date   : Jan 24, 2023
 * 
 */
public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> product = new TreeSet<>();
		
		product.add("TV");
		product.add("phone");
		product.add("speaker");
		product.add("amplifier");
		product.add("laptop");
		product.add("TV");
		product.add("phone");
		
		//use Iterator to print the Set
		Iterator<String> itr = product.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//print first and last product, print size
		System.out.println("First product is: "+((TreeSet<String>) product).first());
		System.out.println("Last product is: "+ ((TreeSet<String>) product).last());
		System.out.println("Size of the set: "+ product.size());
		
		//remove an element from TreeSet
		product.remove("amplifier");
		System.out.println("Product after remove: "+ product);
		System.out.println("Size of set after removal: "+ product.size());
	}

}
