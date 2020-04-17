import java.util.*;

public class PrimeNumbers {
  public static void main (String [] args) {
    //variables
    int i = 3;
    int count;
    IntBag primeNumbers;
    
    //program code
    
    primeNumbers = new IntBag();  //creates a new int bag
    
    primeNumbers.add(2); //adds the first integer to the bag
    count = 1;

    do
    {
      for (int j = 0; j < count; j++) {
        
        if (i % primeNumbers.get(j) == 0) {
          j = count; 
          i++;
        } else if ( j == count-1) {
          primeNumbers.add(i);
          count++;
        }
      }
    }
    while (count < 100);
    
    System.out.println("First 100 Prime numbers are:");
    System.out.println(primeNumbers); // prints out the content
  }
}

