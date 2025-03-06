// Java program to demonstrate how to use Java's Random class 
import java.util.*; 
  
public class Main { 
   public static void main(String[] args) { 
      // initialize random number generator 
      Random rand = new Random(); 
  
      // generate a random integer between 1 and 6 
      int randomNumber = rand.nextInt((6 - 1) + 1) + 1; 
  
      System.out.println("Random number: " + randomNumber); 
   } 
} 
