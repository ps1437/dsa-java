package com.syscho.dsa.datastructure.stack;

public class MyStackEmployeeTester {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        // Adding some sample elements to the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Current Stack:");
        print(myStack);

        // Adding a new element to the stack
        myStack.push(40);
        System.out.println("Element added to stack: 40");

        // Peeking at the top element of the stack
        System.out.println("Element at top of stack: " + myStack.peek());

        // Popping an element from the stack
        System.out.println("Popped element from stack: " + myStack.pop());

        // Printing the stack after operations
        System.out.println("Current Stack:");
        print(myStack);

        // Clearing the stack
        myStack.clear();
        System.out.println("Stack cleared.");

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + myStack.isEmpty());
    }

    private static void print(MyStack<Integer> myStack) {
        myStack.forEach(x -> System.out.print(x + ", "));
        System.out.println();
    }
}
