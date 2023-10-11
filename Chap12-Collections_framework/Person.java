package com.alamin.chap12.collections_framework;

import java.util.Set;
import java.util.TreeSet;

// Set example
public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
//        return o.getName().compareTo(this.getName());
    }


    public static void main(String[] args) {
        Set<Person> person = new TreeSet<>();
        person.add(new Person("Bazlur Rahman"));
        person.add(new Person("Mukit Chawdory"));
        person.add(new Person("Mohammad Alamin"));

        System.out.println(person.size());
        for (Person persons : person) {
            System.out.println(persons.getName());
        }

    }


}
