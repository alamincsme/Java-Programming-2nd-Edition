package com.alamin.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URL_Input {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a URL: ");
        String urlInput = scanner.nextLine();

        try {
            URL url = new URL(urlInput);
            System.out.println("URL Object: " + url);
        } catch (MalformedURLException e ) {
            System.out.println("Invalid URL. " + urlInput);
        }
    }
}
