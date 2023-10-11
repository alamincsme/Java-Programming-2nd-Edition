package com.alamin.chap12.collections_framework.customer;

import java.util.PriorityQueue;
import java.util.Queue;

public class Customer implements Comparable<Customer> {
    private final String name;
    private final int age;


    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(o.age, this.age);
    }

    public static void main(String[] args) {
        Queue<Customer> customers = new PriorityQueue<>();

        customers.offer(new Customer("Bazlur Rahman", 45));
        customers.offer(new Customer("Mukit Chawdory", 51));
        customers.offer(new Customer("Mohammad Alamin", 28));


        while (!customers.isEmpty()) {
            Customer customer = customers.poll();
            serve(customer);
        }
    }

    private static void serve(Customer customer) {
        System.out.println("Serving Customer-name: " + customer.getName() + ", age: " + customer.getAge());
    }


}
