package org.example.structures;

import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {
        //LIFO
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(2));
    }
}
