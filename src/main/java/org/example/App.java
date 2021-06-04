/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Gabriel Fernandez
 */

package org.example;
import java.util.Scanner;

public class App 
{

    // Main function, yes I realize how inefficient this method is
    public static void main( String[] args )
    {
        // Initialize variables as well as numbers array
        int flag = 0;
        int max = -987654321;
        int[] numbers = new int[3];

        // Prompt user for the inputted numbers and store
        // inside the array
        System.out.println("Enter the first number:");
        Scanner firstNum = new Scanner(System.in);
        numbers[0] = firstNum.nextInt();

        System.out.println("Enter the second number:");
        Scanner secondNum = new Scanner(System.in);
        numbers[1] = secondNum.nextInt();

        System.out.println("Enter the third number:");
        Scanner thirdNum = new Scanner(System.in);
        numbers[2] = thirdNum.nextInt();

        // Loop through all inputted numbers
        for (int i = 0; i < 3; i++) {
            // If the current number is equal to the previously
            // inputted number (which would be the max if this
            // were the first iteration), update flag to 1
            if (numbers[i] == max) {
                flag = 1;
            }
            // If the number is greater than the current max,
            // update max to be that number and continue looping
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Since my method sucks, I also need to check if
        // the first number is equal to the third number
        // (Thank god it's only asking for three numbers)
        if (numbers[0] == numbers[2]) {
            flag = 1;
        }

        // If the flag was never changed to 1, that means no numbers
        // repeated, so we can print out the maximum number
        if (flag == 0) {
            System.out.println("The largest number is " + max + ".");
        }

        // If the flag is 1, then do nothing, the program will close on
        // it's own
    }
}
