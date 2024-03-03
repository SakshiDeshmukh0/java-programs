package com.java;
import java.util.Scanner;

public class Taskk10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                System.out.printf("%5d ", (i * j));
            }
            System.out.println(); 
        }
    }
}
