/*******************************************************************************
 * Copyright (c) 2020 Ogulcan Unal
 * All rights reserved. This program and the accompanying materials
 * are made available.
 *
 * Contributors:
 *     Ogulcan Unal
 *******************************************************************************/  
import java.util.*;
public class IntBagIterator implements Iterator {
  
  // Variables
  private IntBag bag;
  private int index;
  
  // Constructor
  public IntBagIterator(IntBag bag) {
    this.bag = bag;
    index = 0; 
  }
  
  // hasnext method
  public boolean hasNext() 
  {
    if(index < bag.size()) 
    {
      return true;
    }
    else
      return false;
  }
  
  // remove again
  public void remove() {
    bag.remove(index);
  }

  // find value 
  public Integer next() {
    if(hasNext()){

      index ++;
      return bag.get(index-1);
    }
    else
      return null;
  }
  
  public int nextInt() {
  index++;
  return (Integer)bag.get(index);
  }
}