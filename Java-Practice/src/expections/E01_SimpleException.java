package expections;

import java.io.IOException;

/****************** Exercise 1 ******************
 * Create a class with a main() that throws an
 * object of class Exception inside a try block.
 * Give the constructor for Exception a String
 * argument. Catch the exception inside a catch
 * clause and print the String argument. Add a
 * finally clause and print a message to prove
 * you were there.
 ***********************************************/
 

public class E01_SimpleException {
  public static void main(String args[]) {
	  try{
		  throw new IOException("a new exception");
	  }catch(IOException e){
		  System.out.println(e.getMessage());
	  }catch(Exception e){
		  System.out.println("This one should never be reached.");
	  }finally{
		  System.out.println("I am here.");
	  }
  }
} 
