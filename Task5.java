//5.Write a program to find the GCD (Greatest Common Divisor) of two numbers using a  loop
package com.java;
import java.util.Scanner;
public class Task5
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int gcd = 1;
        for (int i = 2; i <= Math.min(num1, num2); i++)
        {
            if (num1 % i == 0 && num2 % i == 0) 
            {
                gcd = i;                
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
