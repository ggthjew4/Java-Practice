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
	private final Link<T> header = new Link<T>(null, null);

	SList() {
	}


	public SListIterator<T> iterator() {
		return new SListIteratorImpl();
	}

	private static class Link<T> {
		T element;
		Link<T> next;

		Link(T element, Link<T> next) {
			this.element = element;
			this.next = next;
		}
	}

	private class SListIteratorImpl implements SListIterator<T> {
		private Link<T> lastReturned = header;
		private Link<T> next;

		SListIteratorImpl() {
		}

		public boolean hasNext() {
			return false;
		}

		public T next() {
			return null;
		}

		public void remove() {
		}

		public void add(T element) {
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

public class E08_SList {
	public static void main(String[] args) {
		
	}
} /*
 * Output: Demonstrating SListIterator... [] false [One, Two, Three] One Two
 * Three [Four, One, Two, Three] Four One [One, Two, Three]
 * 
 * Demonstrating ListIterator... [] false [One, Two, Three] One Two Three [Four,
 * One, Two, Three] Four One [One, Two, Three]
 */// :~
