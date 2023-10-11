package com.alamin.chap12.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> company = new ArrayList<>();

        company.add("TherapBD");
        company.add("BJIT");
        company.add("Kaz Software");
        company.add("Square Group");
        company.add("Dynamic Solutions");

        System.out.println(company);

        int totalCompany = company.size();
        System.out.println(totalCompany);

        String secondCompany = company.get(1);
        System.out.println("Second Company in the list: " + secondCompany);

        company.set(1, "VivaSoft");
        company.remove(1);
        System.out.println(company);


    }
}
