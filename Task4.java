//4.Using a  loop, reverse a given number (e.g., 12345 becomes 54321).
package com.java;
import java.util.Scanner;
public class Task4
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();
        
        int reversedNumber = 0;
        while (number != 0) 
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Reversed number: " + reversedNumber);
    }
}

