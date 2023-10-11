package com.alamin.chap09.generic.practice.problem12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterObject {

    public static <T> List<T> filter(T[] list, Predicate<T> predicate) {
        ArrayList<T> result = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String [] words = {"apple", "banana", "cherry", "date", "elderberry","coconut"};

        List<String> wordStartingWithC = filter(words, w -> w.startsWith("c"));
        System.out.println(wordStartingWithC);

    }
}
