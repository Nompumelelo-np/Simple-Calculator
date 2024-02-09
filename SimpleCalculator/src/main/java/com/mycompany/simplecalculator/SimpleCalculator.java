/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Acer-User
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple calculator");
        System.out.print("Enter num1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = input.nextDouble();
        /*System.out.print("Enter operator:");
        System.out.print("1. Addition");
        System.out.print("2. Subtraction");
        System.out.print("3. Multiplication");
        System.out.print("4. Division");*/
        System.out.print("Enter operator of choice: ");
        String operator = input.next();
        
        
        System.out.println("__________________");
        switch (operator)
        {
            case "+":
                System.out.println("Your answer is " + (num1 + num2) );
                break;
            case "-":  
                System.out.println("Your answer is " + (num1 - num2));
                break;
            case "*":
                System.out.println("Your answer is " + (num1 * num2));
                break;
            case "/":
                if(num2 != 0)
                {
                System.out.println("Your answer is " + (num1 / num2));
                }
                else
                {
                System.out.println("Cannot divide by zero");    
                }
                    
                
        
        }
        
    }
}
