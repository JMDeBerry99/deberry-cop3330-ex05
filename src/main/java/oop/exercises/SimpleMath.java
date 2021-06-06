/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class SimpleMath
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        //inputs
        System.out.print("What is the first number? ");
        String first = in.nextLine();
        System.out.print("What is the second number? ");
        String second = in.nextLine();

        //numerical conversion
        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);

        //numerical operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        //output
        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d", num1, num2, sum, num1, num2,
                            difference, num1, num2, product, num1, num2, quotient);
    }
}
