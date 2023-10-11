package com.alamin.chap12.collections_framework;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alamin"));
        persons.add(new Person("Bazlur Rahman"));
        persons.add(new Person("Mukit chawdhory"));
        persons.add(new Person("Mohammad"));


        Collections.sort(persons);
        Person key = new Person("Mohammad");
        int index = Collections.binarySearch(persons , key);
        if (index >= 0 ) {
            System.out.println("Found.");
        } else {
            System.out.println("Not found.");
        }

    }
}
