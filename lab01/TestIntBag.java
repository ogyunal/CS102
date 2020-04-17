
/*Author: Ogulcan Unal
 * 
 * @version 19.02.2020
 * */

import java.util.*;
public class TestIntBag {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    IntBag testIntBag = null;
    int option;
    int singleValue = 0;
    IntBag newSetForLocation = null;
    
    //Menu
    do {
      System.out.println("1. Create a new empty collection with a specified maximum capacity (any previous values are lost!)");
      System.out.println("2. Read a set of positive values into the collection (use a negative value to indicate all the values have been entered.)");
      System.out.println("3. Print the collection of values.");
      System.out.println("4. Add a value to the collection of values at a specified location");
      System.out.println("5. Remove the value at a specified location from the collection of values");
      System.out.println("6. Read a single test value");
      System.out.println("7. Compute the set of locations of the test value within the collection");
      System.out.println("8. Print the set of locations.");
      System.out.println("9. Find the minimum value.");
      System.out.println("10. Find the maximum value.");
      System.out.println("11. Quit the program.");
      System.out.println();
      System.out.print("Please choose one of these option: ");
      option = scan.nextInt();
      
      // create the IntBag with specified size
      if(option == 1) {
        System.out.println("Please enter the maximum capacity: ");
        int maxCapacity;
        maxCapacity= scan.nextInt();
        testIntBag = new IntBag(maxCapacity);
      }
      // read new values from the user
      else if(option == 2){
        int element = scan.nextInt();
        
        while (element != 0) {
          if (element < 0){
            System.out.println("Please add ONLY positive integers");
            element = 0;
          }
          else {
            testIntBag.add(element);
            element = scan.nextInt();
          }
        }
      }
      // print the collection
      else if(option == 3) {
        // We have toString() method to print this array directly
        System.out.println(testIntBag);
      }
      //add a value to a specific location of values
      else if(option == 4){
        System.out.print("value: ");
        int value = scan.nextInt();
        if (value < 0 )
          System.out.println("please enter ONLY positive integers.");
        else{
          System.out.print("index: ");
          int index = scan.nextInt();
          testIntBag.add(value,index);
          System.out.println(testIntBag);
        }
      }
      // remove element
      else if(option == 5) {
        System.out.print("Index: ");
        int index = scan.nextInt();
        testIntBag.remove(index);
      }
      //read a single test value and remove it from the bag.
      else if(option == 6) {
        System.out.println("Please enter the value which you want to find: ");
        singleValue = scan.nextInt();
      }
      else if(option == 7) {
        newSetForLocation = new IntBag(IntBag.counter);
        newSetForLocation = testIntBag.findAll(singleValue);
      }
      

      else if(option == 8) {
        System.out.println("The locations are: " + newSetForLocation);
      }
      
      else if(option == 9) {
        System.out.println("The minimum int is : " + testIntBag.getMinValue());
        
      }
      else if(option == 10) {
        System.out.println("The maximum int is: " + testIntBag.getMaxValue());
        
      }
    } while(option != 11);
  }
}