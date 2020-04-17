package shapes;
/******************************************************************************* 
 * Copyright (c) 2020 Ogulcan Unal 
 * All rights reserved. This program and the accompanying materials 
 * are made available. 
 * 
 * Contributors: 
 *     Ogulcan Unal 
 *******************************************************************************/ 
public interface Locatable{
 
   public abstract  void setLocation( int x, int y);

   public abstract int getX();
   
   public abstract  int getY();
   
}