package com.alamin.chap09.generic.generic_method;

public class GenericMethod {
    public static void main(String[] args) {

        CustomPair<String, Integer> p1 = new CustomPair<>("key", 1);
        CustomPair<String, Integer> p2 = new CustomPair<>("key", 1);
        boolean result = compare(p1, p2);
        System.out.println(result);
    }

    private static <K, V> boolean  compare(CustomPair<String, Integer> p1, CustomPair<String, Integer> p2) {
        return p1.getKey().equals(p2.getKey()) && p2.getValue().equals(p1.getValue());
    }
}
