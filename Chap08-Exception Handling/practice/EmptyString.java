package com.alamin.practice;

import java.util.EmptyStackException;
import java.util.Scanner;

public class EmptyString {
    private static Scanner  scanner = new Scanner(System.in);

    public static void main(String[] args) throws EmptyStringException {
        stringChecker(scanner.nextLine());
    }

    private static void stringChecker(String s) throws EmptyStringException {
        try {
            if (s.isEmpty()) {
                throw new EmptyStringException("This string is empty.");
            }
            System.out.println("This String: " + s);
        } catch (EmptyStringException e) {
            e.printStackTrace();
        }
    }
}

class EmptyStringException extends Throwable {
    public EmptyStringException(String message) {
        super(message);
    }
}
