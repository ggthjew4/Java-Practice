package expections;

//: exceptions/E06_LoggingExceptions.java
/****************** Exercise 6 ******************
 * Create two exception classes, each of which
 * performs its own logging automatically.
 * Demonstrate that these work.
 ***********************************************/

import java.util.logging.Level;
import java.util.logging.Logger;

class LoggingException1 extends Exception {

	private static final String EXCEPTION_CATEGORY = "type1";
	private static Logger logger = Logger.getLogger("LoggingException1");
	
	public LoggingException1(){
		
	}
	
	public LoggingException1(String message) {
		super(message);
		logger.log(Level.WARNING, EXCEPTION_CATEGORY, this);
	}

}

public class E06_LoggingExceptions {
	public static void main(String[] args) {
		try{
			throw new LoggingException1("a new message");
		}catch(LoggingException1 e){

		}
	}
}
