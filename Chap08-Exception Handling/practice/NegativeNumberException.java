package com.alamin.practice;

import java.util.Scanner;

public class NegativeNumberException {                // java programming book problem 02
     private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          acceptPositiveNumbver(a, b);
    }

    private static void acceptPositiveNumbver(int a, int b) {
           try {
                if ( a < 0  || b  < 0) {
                     throw  new IllegalArgumentException("a or b is not positive number.");
                } else {
                     System.out.println("a and b positibe number.");
                }
           } catch (IllegalArgumentException e ) {
                    e.printStackTrace();
           }
    }
}
