package chap05;

import java.util.Scanner;

public class AverageMinMaxCalculator {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Length of Array : ");
        int sizeOfArray = scanner.nextInt();

        int [] numbers = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0 ;
        for (int i = 0 ; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double)  sum / numbers.length;


        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }

            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }

}
