package com.alamin.chap12.collections_framework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        String [] brackets = {"(()){}()", "(){}", "({}(", "){})"};
        for (String exp : brackets) {
            String isBalanced = isBalanced(exp.toCharArray()) ? "Balanced" : "Not Balanced";
            System.out.println(isBalanced);
        }
    }

    public static boolean isBalanced(char input[]) {
//        int len = input.length;
//        char lastChar;
//        int top = 0;
//        char[] stack = new char[len];
//
//        for (int i = 0; i < len; i++) {
//            char x = input[i];
//            if (x == '(' || x == '[' || x == '{') {
//                stack[top] = x;
//                top++;
//            } else if (x == ')' || x == ']' || x == '}') {
//                if (top == 0) {
//                    return false;
//                }
//                top--;
//                lastChar = stack[top];
//                if ( x == ')' && lastChar != '(' ||
//                           x == '}' && lastChar != '{' || x == ']' && lastChar != '[') {
//                    return false;
//                }
//            }
//        }
//        return top == 0 ;

        Stack<Character> stack = new Stack<>();
        int len = input.length ;
        char lastItem;

        for (int i =  0; i < len ; i++ ) {
             char x = input[i];

             if ( x == '(' || x == '{' || x == '[' ) {
                 stack.push(x);
             } else  if (x == ')' || x == '}' || x == ']') {
                 if (stack.isEmpty()) {
                     return false;
                 }

                 lastItem = stack.pop();
                 if ( x == ')' && lastItem != '(' ||
                           x == '}' && lastItem != '{' || x == ']' && lastItem != '[') {
                    return false;
                }
             }
        }
        return stack.isEmpty();
    }
}
