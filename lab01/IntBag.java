import java.util.*;

public class IntBag {
  
  //properties
  
  private int[] bag;
  int valid = 0;
  public static int counter;
  
  //constructor
  public IntBag() {
    bag = new int[100];
  }
  
  public IntBag (int maxNumber ) {
    bag  = new int [maxNumber];
  }
  
  //methods
  public void add (int element) {
    if ( valid < bag.length) {
      bag[valid] = element;
      valid++;
    } else {
      System.out.println("Bag is full"); 
    }
  }
  
  //add method
  public void add(int element, int indexToAdd) {
    for (int i = valid; i > indexToAdd; i--) {
      bag[i] = bag[i-1]; 
    }
    bag[indexToAdd] = element;
    valid++;
  }
  
  //remove method
  public void remove (int element) {
    for (int i = element; i < valid; i++) {
      bag[i] = bag[i+1];
    }
    valid--;
  }
  
  //contains method
  public boolean contains (int[] bag, int value) {
    for (int i = 0; i < bag.length; i++) {
      if (bag[i] == value) {
        return true;
      }
    }
    return false;
  }
  
  // to String Method
  public String toString() {
    String str = "";
    boolean continueIteration = true;
    for(int i = 0; i < valid && continueIteration; i++) {
      if (get(i) != -1)
        str = str + bag[i] + " ";
      else
        continueIteration = false;
    }
    return str;
  }
  
  // Size Method
  public int size() {
    int count = 0;
    boolean continueIteration = true;
    while (count < bag.length && continueIteration) {
      if (get(count) != -1) 
        count++;
      else
        continueIteration = false;
    } 
    return count;
  }
  
  // get the value at location i within the collection.
  public int get(int index) {
    return bag[index];
  }
  
  public IntBag findAll (int number) {
    
    IntBag set = new IntBag(bag.length);
    for (int i = 0; i <= valid-1; i++) {
      if (bag[i] == number) {
        set.add(i);
        counter++;
      }
    }
    return set;
  }
  //Maximum finder method
  public int getMaxValue (){
    int maxValue = bag[0];
    for(int i=1;i < valid; i++){
      if(bag[i] > maxValue){
        maxValue = bag[i];
      }
    }
    return maxValue;
  }
  //minimum finder method
  public int getMinValue (){
    int minValue = bag[0];
    for(int i=1;i<valid; i++){
      if(bag[i] < minValue){
        minValue = bag[i];
      }
    }
    return minValue;
  }
}

