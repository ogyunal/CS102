/*******************************************************************************
 * Copyright (c) 2020 Ogulcan Unal
 * All rights reserved. This program and the accompanying materials
 * are made available.
 *
 * Contributors:
 *     Ogulcan Unal
 *******************************************************************************/
import java.util.*;
public class TestIterators
{
  public static void main( String[] args) 
  { 
    
    // Variables
    Iterator i, j;
    IntBag bag = new IntBag();
    i = new IntBagIterator( bag );
    
    //fills up the intbag
    for(int l = 1; l<=5;l++){
      bag.add(l);
    }
    while ( i.hasNext() ) {
      System.out.println( i.next() );
      j =  new IntBagIterator( bag );
      j =  bag.iterator();
      
      while ( j.hasNext() ) 
      {
        System.out.println( "--" + j.next());
      } 
    }
  }
}