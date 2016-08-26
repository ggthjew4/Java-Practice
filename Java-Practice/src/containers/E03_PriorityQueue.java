//: containers/E11_PriorityQueue.java
/****************** Exercise 11 *****************
 * Create a class that contains an Integer that is
 * initialized to a value between 0 and 100 using
 * java.util.Random. Implement Comparable using this
 * Integer field. Fill a PriorityQueue with objects of
 * your class, and extract the values using poll() to
 * show that it produces the expected order.
 ***********************************************/
package containers;

import java.util.PriorityQueue;
import java.util.Random;

class Item implements Comparable<Item> {

	static Random random = new Random();
	int randomNumber;

	Item() {
		randomNumber = random.nextInt(101);
	}

	public int compareTo(Item arg) {
		if (this.randomNumber > arg.randomNumber) {
			return 1;
		} else if (this.randomNumber < arg.randomNumber) {
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return String.valueOf(randomNumber);
	}
}

public class E03_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Item> queue = new PriorityQueue<>();
		for (int i = 0; i < 10; i++) {
			queue.offer(new Item());
		}
		System.out.println(queue.toString());
		
		
		Item item;
		while((item = queue.poll()) != null){
			System.out.println(item);
		}
		System.out.println(queue.toString());
	}
}
/*
 * Output: 15 17 18 20 22 62 65 67 95 100
 */// :~
