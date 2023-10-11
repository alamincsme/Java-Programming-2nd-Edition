package com.alamin.chap12.collections_framework.hash_map;

import com.alamin.chap12.collections_framework.Person;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Person, Address> addressBook = new HashMap<>();
        Person person = new Person("Alamin");
        Address address = new Address("500 Kingston Rd","Toronto", "ON", "Canada", "M4L1V3" );

        addressBook.put(person, address);

        System.out.println(addressBook.toString());

    }

}
