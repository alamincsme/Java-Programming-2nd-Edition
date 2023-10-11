package com.alamin.chap09.generic.practice.problem02;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.StringJoiner;

public class Sequence <T> {
    private static final int DEFAULT_CAPACITY = 5;
    private T[] elements;
    private int count;


    public Sequence() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return count == 0 ;
    }

    public boolean isFull() {
        return elements.length == count;
    }

    public int size() {
        return count;
    }

    public void add(T item) {
        if (isFull()) {
            grow() ;
        }
        elements[count] = item;
        ++count;
    }



    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        --count;
        return elements[count];
    }


    private void grow() {
        int newCapacity = elements.length * 2;
        Arrays.copyOf(elements, newCapacity);
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[","]");
        for (int i = 0; i < count ; i++) {
            T element = elements[i];
            joiner.add(String.valueOf(element));
        }
        return joiner.toString();
        
    }
    public static void main(String[] args) {
       Sequence<String> softwareCompany = new Sequence<>();
       softwareCompany.add("GOOLE");
       softwareCompany.add("MICROSOFT");
       softwareCompany.add("ORACLE");

       System.out.println(softwareCompany);

       softwareCompany.remove();
        System.out.println(softwareCompany);

    }


}
