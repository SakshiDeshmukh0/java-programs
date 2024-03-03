//1.Create a program to display the Fibonacci series and factorial up to a specified limit using a loop.
package com.java;
import java.util.Scanner;
public class Fibnacii
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("\nFactorial Series:");
        for (int i = 1; i <= n; i++) 
        {
            int factorial = 1;
            for (int j = 1; j <= i; j++)
            {
                factorial *= j;
            }
            System.out.print(factorial + " ");
        }
    }
}