//: containers/E07_CrossInsertion.java
/****************** Exercise 7 *****************
 * Create both an ArrayList and a LinkedList, and
 * fill each using the Countries.names() generator.
 * Print each list using an ordinary Iterator, then
 * insert one list into the other by using a
 * ListIterator, inserting at every other location.
 * Now perform the insertion starting at the end of
 * the first list and moving backward.
 ***********************************************/
package containers;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class E01_CrossInsertion {
	public static void main(String args[]) {
		
		List arrayList = new ArrayList<String>(Countries.names());
		List linkedList = new LinkedList<String>(Countries.names());
		
		Iterator iterator1 = arrayList.iterator();
		while(iterator1.hasNext()){
			System.out.println(iterator1.next());
		}
		System.out.println("----------------------------------------");
		
		
		
		Iterator iterator2 = linkedList.iterator();
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		System.out.println("----------------------------------------");
		
		
		
		ListIterator iterator3 = arrayList.listIterator(arrayList.size());
		while(iterator3.hasPrevious()){
			linkedList.add(iterator3.previous());
		}
		
		Iterator iterator4 = linkedList.iterator();
		while(iterator4.hasNext()){
			System.out.println(iterator4.next());
		}
	}
} 
