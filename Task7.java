//7.Using the concept of loops and conditional statement which is better for performing the addition subtraction Multiplication division and Modules
package com.java;
import java.util.Scanner;
public class Task7
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

          int product = num1 * num2;
           System.out.println("Product: " + product);

       
         double quotient = (double) num1 / num2;
         System.out.println("Quotient: " + quotient);
        
        int modulus = num1 % num2;
        System.out.println("Modulus: " + modulus);
    }
}






