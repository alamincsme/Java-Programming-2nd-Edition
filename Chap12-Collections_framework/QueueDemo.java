package com.alamin.chap12.collections_framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 10; i >= 1 ; i--) {
            queue.add(i);
        }

        while (! queue.isEmpty()) {
            int item = queue.poll();
            System.out.println("Item is: " + item);
        }
    }
}
