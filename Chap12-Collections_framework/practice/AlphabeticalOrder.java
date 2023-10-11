package com.alamin.chap12.collections_framework.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlphabeticalOrder {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of words: ");
        int numWords = scanner.nextInt();
        scanner.nextLine();

        List<String> words = new ArrayList<>();
        for (int i = 0 ; i < numWords; i++) {
            System.out.println("Enter word: "+ (i + 1));
            words.add(scanner.nextLine());
        }

        Collections.sort(words);
        System.out.println("Words in alphabetical Order: " + words);
    }
}
