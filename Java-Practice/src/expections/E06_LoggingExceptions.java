package expections;
//: exceptions/E06_LoggingExceptions.java
/****************** Exercise 6 ******************
 * Create two exception classes, each of which
 * performs its own logging automatically.
 * Demonstrate that these work.
 ***********************************************/

import java.util.logging.Logger;

class LoggingException1 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException1");
	

}

public class E06_LoggingExceptions {
	public static void main(String[] args) {
	}
}
