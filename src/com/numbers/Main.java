/**
 *  Java program to find numbers dividable by 3.
 */

package com.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a list of 99 random integers
        List<Integer> list = new ArrayList<>();

        // Adding 99 random numbers to the list
        for (int index = 0; index < 99; index++) {

            list.add(new Random().nextInt());

        }

        // Checking that numbers are dividable by 3 and printing a result to console.
        for (int index = 0; index < 99; index++) {

            // Creating helping variable to store current number
            int number = list.get(index);

            // Condition
            if (number % 3 == 0) {

                // Printing the result to console.
                System.out.println(number + " is dividable by 3.");

            } else {

                // Printing the result to console.
                System.out.println(number + " is not dividable by 3.");

            }
        }
    }
}