//: containers/E08_SList.java
/****************** Exercise 8 *****************
 * Create a generic, singly-linked list class
 * called SList, which, to keep things simple,
 * does not implement the List interface. Each Link
 * object in the list should contain a reference to
 * the next element in the list, but not the previous
 * one (LinkedList, in contrast, is a doubly-linked
 * list, which means it maintains links in both
 * directions). Create your own SListIterator which,
 * again for simplicity, does not implement ListIterator.
 * The only method in SList other than toString()
 * should be iterator(), which produces an
 * SListIterator. The only way to insert and remove
 * elements from an SList is through SListIterator.
 * Write code to demonstrate SList.
 ***********************************************/
package containers;

interface SListIterator<T> {
	boolean hasNext();

	T next();

	void remove();

	void add(T element);
}

class SList<T> {
	// Utilization of the 'Null Object' pattern

	SList() {
	}
	
	
	private Link<T> header = new Link<T>(null, null);
	private static class Link<T> {
		T element;
		Link<T> next;
		
		Link(T element, Link<T> next) {
			this.element = element;
			this.next = next;
		}
	}
	
	
	public SListIterator<T> iterator() {
		return new SListIteratorImpl();
	}
	private class SListIteratorImpl implements SListIterator<T> {
		private Link<T> lastReturned = header;
		private Link<T> next = header;

		SListIteratorImpl() {
		}

		public boolean hasNext() {
			if(lastReturned.next != null){
				return true;
			}else{
				return false;				
			}
			
		}

		public T next() {
			if(lastReturned.next != null){
				T element = lastReturned.next.element;
				lastReturned = lastReturned.next;
				return element;
			}else{
				throw new IllegalStateException();
			}
		}

		public void remove() {
			if(header.next != null){
				header = header.next;
				lastReturned = header;
			}else{
				throw new IllegalStateException();
			}
		}

		public void add(T element) {
			if(next.next != null){
				next.next.next = new Link<T>(element, null);
				next = next.next;				
			}else{
				header.next = new Link<T>(element, null);
			}
		}
	}
	
	
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("[");
		for (SListIterator<T> it = iterator(); it.hasNext();) {
			T element = it.next();
			buf.append(element == this ? "(this SList)" : String
					.valueOf(element));
			if (it.hasNext())
				buf.append(", ");
		}
		buf.append("]");
		return buf.toString();
	}
}

public class E02_SList {
	public static void main(String[] args) {	
		SList<String> sList = new SList<>();
		SListIterator<String> iterator = sList.iterator();
		
		iterator.add("one");
		iterator.add("two");
		iterator.add("three");
		System.out.println(sList.toString());
		
		iterator.remove();
		System.out.println(sList.toString());
		
		iterator.remove();
		System.out.println(sList.toString());
		
		iterator.add("four");
		iterator.add("five");
		System.out.println(sList.toString());
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		iterator.remove();
		iterator.remove();
		System.out.println(sList.toString());
	}
} /*
 * Output: Demonstrating SListIterator... [] false [One, Two, Three] One Two
 * Three [Four, One, Two, Three] Four One [One, Two, Three]
 * 
 * Demonstrating ListIterator... [] false [One, Two, Three] One Two Three [Four,
 * One, Two, Three] Four One [One, Two, Three]
 */// :~
