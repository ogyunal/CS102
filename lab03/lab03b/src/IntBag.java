/*******************************************************************************
 * Copyright (c) 2020 Ogulcan Unal
 * All rights reserved. This program and the accompanying materials
 * are made available.
 *
 * Contributors:
 *     Ogulcan Unal
 *******************************************************************************/  
import java.util.*;
public class IntBag {
  private int[] bag;
  private int m;
  //Constructors 
  public IntBag() {
    bag  = new int [100];
    bag[0] = -1;
  }
  public IntBag(int MaxNumb){
    bag  = new int [MaxNumb];
    bag[0] = -1;
  }

    
  
  // remove method by looking index
  public void remove(int index) {
    /*
     for (int i = index; i < size() - 1; i++) {
     bag[i] = bag[i + 1];
     }
     bag[size() - 1] = -1;
     */
    bag[index] = bag[size()-1];
    bag[size()-1] = -1;
    
  }
  
  //add a value to last index
  public void add(int elem) {
    int size = size();
    if (size < bag.length - 1) { 
      bag[size] = elem;
      bag[size + 1] = -1;
    }
    else if (size == bag.length - 1) {
      bag[size] = elem;
    }
    //case if bag is full, extends the bag
    else {
      int increaser [] = new int[size * 2];
      for (int i = 0; i<bag.length; i++){
        increaser[i] = bag[i];
      }
      bag = increaser;
      bag[size] = elem;
      bag[size + 1] = -1;
      
    }
  }
  
  // add a value to the end of the collection and to add a value at a particular index location i
  public boolean add(int value, int index) {
    if (index < size()) {
      int last = bag[bag.length-1];
      
      for (int i = bag.length - 2; i >= index; i--) {
        bag[i + 1] = bag[i];
      }
      bag[index] = value;
      return true;
    } 
    else 
      return false;
  }
  
  public int getIt(int k){
    return bag[k];
  }
  // to String Method
  public String toString() {
    String str = "";
    boolean continueIteration = true;
    for(int i = 0; i <= bag.length - 1 && continueIteration; i++) {
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
  
  // print all items in the array
  public IntBag findAll(int value) {
    IntBag result = new IntBag(bag.length);
    for(int i = 0; i <= bag.length - 1; i++){
      if(bag[i] == value)
        result.add(i);
    }
    return result;
  }
  //remove a specific value from the bag.
  public void removeAll (int singleValue){
    int count = 0;
    for(int j = 0; j<size();){
      if (bag[j] == singleValue){
        remove(j);
        count ++;
      }
      else
        j++;
    }
    if (count == 0);
    System.out.println("This number is not in the bag!");
  }
  //Iterator
  public Iterator iterator(){
    return new IntBagIterator(this);
  }
  
//   public Iterator iterator(int m){
//    return new IntBagStepIterator(m, this);
//  }
//  
  
}