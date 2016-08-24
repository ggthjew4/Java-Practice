package expections;
/****************** Exercise 2 ******************
 * Define an object reference and initialize it
 * to null. Try to call a method through this
 * reference. Now wrap the code in a try-catch
 * clause to catch the exception.
 ***********************************************/


public class E02_NullReference {
  public static void main(String args[]) {
	   String word = null;
	   try{
		   System.out.println(word.equals(""));
	   }catch(NullPointerException e){
		   e.printStackTrace();
	   }
  }
} 
