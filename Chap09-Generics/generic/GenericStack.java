package com.alamin.chap09.generic;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.StringJoiner;

public class GenericStack <T> {
    private static final int DEFAULT_CAPACITY = 5;

    private T[] elements;
    private int count;

    public GenericStack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return elements.length == count ;
    }
    public void push(T item) {
        if (isFull()) {
            grow();
        }
        elements[count] = item;
        count ++;
    }

    private void grow() {
        int newCapacity = elements.length * 2 ;
        Arrays.copyOf(elements, newCapacity);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        --count;
        T element = elements[count];
        return element;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(",","[","]");
        for (int i = 0 ; i < count; i++) {
            T element = elements[i];
            joiner.add(String.valueOf(element));
        }
        return joiner.toString();
    }

    public static void main(String[] args) {
        GenericStack<String>  company = new GenericStack<>();
        company.push("BJIT");
        company.push("Brain Station 23");
        company.push("Dynamic Solution Inovator Lt.");
        company.push("Sqaure Group.");

        System.out.println(company);

        //pop element in the stack
        company.pop();
        System.out.println(company);
    }

}
