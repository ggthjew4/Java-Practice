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

class Item implements Comparable<Item> {
  public int compareTo(Item arg) {
    return 0;
  }
  public String toString() {
    return "";
  }
}

public class E11_PriorityQueue {
  public static void main(String[] args) {
  }
} 
/* Output:
15
17
18
20
22
62
65
67
95
100
*///:~
