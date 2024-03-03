//9.Implement a nested loop to create a pattern of numbers in the shape of a diamond.
package com.java;
public class Task9
{
	public static void main(String[] args) 
	{
        int num = 5; 

        for (int i = 1; i <= num; i++)     //str
        {
            for (int j = 1; j <= num - i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) //rev
        {
            for (int j = 1; j <= num - i; j++) 
            {
                System.out.print(" ");
            }           
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
