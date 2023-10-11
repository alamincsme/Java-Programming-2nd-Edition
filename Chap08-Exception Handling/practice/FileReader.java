package com.alamin.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a file name: ");
        String filename = scanner.nextLine();

        try {
            File file = new File(filename);
            Scanner fileInput = new Scanner(file);

            while (fileInput.hasNext()) {
                System.out.println(fileInput.next());
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        }
    }
}
