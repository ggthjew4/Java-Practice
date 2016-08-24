package expections;
/****************** Exercise 3 ******************
 * Write code to generate and catch an
 * ArrayIndexOutOfBoundsException.
 ***********************************************/


public class E03_ArrayIndexBounds {
  public static void main(String args[]) {
	  int[] array = new int[]{1,2,3};
	  try{
		  System.out.println(array[3]);		  
	  }catch(ArrayIndexOutOfBoundsException e){
		  e.printStackTrace();
	  }
  } 
} 
