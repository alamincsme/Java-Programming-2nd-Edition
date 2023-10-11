package com.alamin;

public class ExceptionDemo {
      public static void main(String[] args) {
            int a = 1;
            int b = 0;

            int result = 0;

            try {
                result = divide(a, b);
            } catch (ArithmeticException e) {
                System.out.println("You can' t divide " + a + " by " + b);
            }
    }

    private static int divide(int a, int b) {
           return  a / b ;
    }
}
