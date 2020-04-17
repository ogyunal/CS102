package shapes;
/******************************************************************************* 
 * Copyright (c) 2020 Ogulcan Unal 
 * All rights reserved. This program and the accompanying materials 
 * are made available. 
 * 
 * Contributors: 
 *     Ogulcan Unal 
 *******************************************************************************/ 
public interface Selectable{

   public abstract boolean getSelected();
   
   public abstract void setSelected( boolean set );
   
   public abstract Shape contains( int x, int y);
}