

import java.util.Arrays;
import java.util.StringJoiner;

public class DynamicArray <T> {
    private static final int DEFAULT_CAPACITY = 5;

    private T[] elements ;
    private  int size;

    public DynamicArray() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ;
    }

    public void add(T item) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = item;
        size++;
    }

    private void grow() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(",","[","]");
        for (int i = 0 ; i < size; i++) {
            T element = elements[i] ;
            joiner.add(String.valueOf(element));
        }
        return joiner.toString();
    }

    public static void main(String[] args) {
        DynamicArray<Integer> numbers = new DynamicArray<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers.toString());

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));

        int totalElements = numbers.size();
        System.out.println("totalElements = " + totalElements);

        DynamicArray<String> cities = new DynamicArray<>();
        cities.add("Dhaka");
        cities.add("New York");
        cities.add("Beijing");
        System.out.println(cities);
    }
}
