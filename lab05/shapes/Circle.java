package shapes;
/******************************************************************************* 
 * Copyright (c) 2020 Ogulcan Unal 
 * All rights reserved. This program and the accompanying materials 
 * are made available. 
 * 
 * Contributors: 
 *     Ogulcan Unal 
 *******************************************************************************/ 
public class Circle extends Shape implements Selectable
{
   
   //properties.
   int radius;
   boolean selected;
   
   //constructors.
   public Circle( int radius )
   {
      this.radius = radius;
      selected = false;
   }
   
   //methods.
   public double getArea()
   {
      return Math.PI * Math.pow( radius, 2);
   }
   
   
   public String toString()
   {
      String str;
      
      str = "The radius of the circle is: " + radius;
      
      return str;
   }
   
   public void setSelected( boolean selected)
   {
      this.selected = selected;
   }
   
   public boolean getSelected()
   {
      
      if( selected == true)
      {
         return true;
      } 
      else 
      {
         return false;
      }
      
   }
   
   public Shape contains( int x, int y)
   {
      
      if( Math.sqrt( Math.pow( x - this.x, 2 ) + Math.pow( y - this.y, 2 )) - radius >= 0 ){
         return null;
      }
      else
      {
         return this;
      }
      
   } 
   
   public int getRadius ()
   {
      return radius;
   }
   
   public void setRadius (int r)
   {
      radius = r;
   }
   
}