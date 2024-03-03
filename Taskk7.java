package com.java;
import java.util.Scanner;
public class Taskk7 
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        
        System.out.println("Choose operation:");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Modulus ");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        double result = 0;
        
       
        switch(choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if(num2 != 0)
                    result = num1 / num2;
                else
                    System.out.println("Error: Division by zero");
                break;
            case 5:
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid choice");
        }        
        System.out.println("Result: " + result);
              scanner.close();
    }
    public static double multiply(double num1, double num2) 
    {
        double result = 0;
        for(int i = 0; i < num2; i++) 
        {
            result += num1;
        }
        return result;
    }
}






