package com.alamin.chap09.generic;

public class Tuple <X, Y> {
    private final X x;
    private final Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void showTypes() {
        System.out.println("Type of X: " + x.getClass().getName() + " and value: " + x);
        System.out.println("Type of y: " + y.getClass().getName() + " and value: " + y);
    }


    public static void main(String[] args) {

        Tuple<String, String> tuple = new Tuple<>("Mohammad","Alamin");
        tuple.showTypes();

        Tuple<String, Integer> person = new Tuple<>("Alamin", 1);
        person.showTypes();

    }
}
