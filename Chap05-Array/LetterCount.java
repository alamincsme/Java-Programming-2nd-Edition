package chap05;

import java.util.Scanner;

public class LetterCount {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Character : ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        char [] letters = input.toCharArray();

        int [] counts = new int[26];

        for (int i = 0 ; i < letters.length ; i++) {
            char letter = letters[i];
            if (Character.isLetter(letter)) {
                int index = letter - 'a';
                counts [index] ++ ;
            }
        }

        System.out.println("Letters count : ");
        for (int i = 0 ; i < counts.length; i++) {
            if (counts[i] != 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + " " + counts[i]);
            }
        }
    }

}
