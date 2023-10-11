package com.alamin.practice;

import java.util.Scanner;

public class NumberTooLarge {                                  // problem no 12
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws NumberTooLargeException {
        System.out.println("Please enter a number: ");
        int a = scanner.nextInt();

        if (a < 100) {
            System.out.println(a + " is smaller than 100.");
        } else {
            throw new NumberTooLargeException("Number too large.");
        }
    }
}
class NumberTooLargeException extends Throwable {
    public NumberTooLargeException(String message) {
        super(message);
    }
}
