package com.alamin.chap12.collections_framework;


import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
    public static void main(String[] args) {
        String [] brackets = {"(()){}()", "(){}", "({}(", "){})"};
        for (String exp : brackets) {
            String isBalanced = isBalanced(exp.toCharArray()) ? "Balanced" : "Not Balanced";
            System.out.println(isBalanced);
        }
    }

    private static boolean isBalanced(char[] charArray) {
        Deque<Character> dq = new ArrayDeque<>();
        char lastItem;

        for (int i = 0 ; i < charArray.length; i++) {
            char x = charArray[i];
            if (x == '(' || x == '{' || x == '[') {
                dq.push(x);
            } else if (x == ')' || x == '}' || x == ']') {
                if (dq.isEmpty()) {
                    return false;
                }

                lastItem = dq.poll();
                if (x == ')' && lastItem != '(' ||
                                   x == '}' && lastItem != '{' || x == ']' && lastItem != '[') {
                    return false;
                }
            }
        }
        return dq.isEmpty();
    }
}
