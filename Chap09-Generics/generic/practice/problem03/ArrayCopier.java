package com.alamin.chap09.generic.practice.problem03;

public class ArrayCopier <T> {
    public void copy(T[] from, T[] to) throws ArraySizeMisMatchException {
        if (from.length != to.length) {
            throw  new ArraySizeMisMatchException("Array size does not match.");
        }

        for (int i = 0 ; i < from.length ; i++) {
            to[i] = from[i];
        }
    }


    public static void main(String[] args) throws ArraySizeMisMatchException {
        Integer[] from = {1, 2, 3, 4, 5, 8, 9};
        Integer[] to = new Integer[from.length];

        ArrayCopier<Integer> copier = new ArrayCopier<>();
        copier.copy(from, to);

        for (Integer n : to) {
            System.out.println(n + " ");
        }

    }
}
class ArraySizeMisMatchException extends Exception {
    public ArraySizeMisMatchException (String message) {
        super(message);
    }
}
