package com.alamin.chap09.generic.practice.problem01;

public class GenericMethodExample {

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 2, 3, 5};
        var count = count(nums, 2);
        System.out.println("Count = " + count);
    }

    public static <T> int count(T[] array, T value) {
        int count = 0;
        for (int i = 0 ; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }
}
