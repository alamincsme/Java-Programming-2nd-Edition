package com.alamin.chap09.generic.practice;

public class MaxFinder {


    public static void main(String[] args) {
        Integer[] arra = {1, 2, 3, 4, 5};
        int max = max(arra);
        System.out.println("max = " + max);
    }
    public static <T extends Comparable<T> > T max( T[] arra) {
        if (arra.length == 0 || arra == null) {
            throw new IllegalArgumentException();
        }
        T max =  arra[0];
        for (T element : arra) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }


}
