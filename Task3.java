//3.Implement a  loop to print the squares and cubes of numbers from 1 to 20
package com.java;

public class Task3 
{
public static void main(String args[])
{
  for(int i=1;i<20;i++)
  {
	  int square = i * i;
      int cube = i * i * i;
      System.out.println("Number"+i + "\tSquare"+square + "\tcube"+cube);
  }
}
}
