package com.alamin.practice;

import java.util.Scanner;

public class NumberFormatException {
      private static Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) {
            System.out.println("Please enter an integer: ");
            String input = scanner.nextLine();

            try {
                  int n = Integer.parseInt(input);
                  System.out.println("You entered: " + n);
            } catch (java.lang.NumberFormatException e) {
                  System.out.println("Invalid Input: Please try again.");
            }
    }
}
