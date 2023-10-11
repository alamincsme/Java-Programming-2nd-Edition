package com.alamin.chap09.generic;

public class Generic<T> {
    private T obj;

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("Type of T: " + obj.getClass().getName());
    }

    //main method.
    public static void main(String[] args) {

        //Interger refernce.
        Generic<Integer> iObj = new Generic<>(88);
        iObj.showType();

        int value = iObj.getObj();
        System.out.println("int value = " + value);


        Generic<String> strObj = new Generic<>("Google");
        strObj.showType();

        String strValue = strObj.getObj();
        System.out.println("Str value = "+ strValue);

        Generic<Long> lObj = new Generic<>(07L);
        long longValue = lObj.getObj();
        System.out.println("Long value = " + longValue);
    }
}
