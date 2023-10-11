package com.alamin.chap09.generic.practice.problem09;

import java.util.Arrays;

public class Queue <T> {
    private static final int DEFAULT_CAPAICTY = 5;
    private T[] arr;
    private int size;
    private int head;
    private int tail;

    public Queue() {
      this.arr = (T[]) new Object[DEFAULT_CAPAICTY + 1];
      this.head = 0 ;
      this.tail = 0 ;
    }

    public void enqueue(T element) {
        if ((tail + 1) % (DEFAULT_CAPAICTY + 1) == head ) {
            throw  new IllegalStateException("Can not enqueue to full queue.");
        }
        arr[tail] = element;
        ++size;
        tail = (tail + 1 ) % (arr.length);

    }


    public T dequeue() {
        if (head == tail) {
            throw new IllegalStateException("can not dequeue from an empty queue.");
        }
        T item = arr[head];
        head = (head + 1) % arr.length ;
        --size;
        return  item;
    }


    public T peek()  {
        if (head == tail) {
            throw new IllegalStateException("can not peek at empty queue.");
        }
        T element = arr[head] ;
        return element;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);

    }

}
