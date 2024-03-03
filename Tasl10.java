//10.Write a Java program to print multiplication tables for n elements 
package com.java;
import java.util.Scanner;
public class Tasl10 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) 
            {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); 
        }
    }
}
