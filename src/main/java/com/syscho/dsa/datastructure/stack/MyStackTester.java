package com.syscho.dsa.datastructure.stack;


import java.util.Scanner;

public class MyStackTester {

    public static void main(String[] args) {
        MyStack<Integer> myList = new MyStack<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter a command (1: add, 2: addMultiple, 3: peek, 4: pop, 5: Search , 6: print, 7: Clear, 8: size, " +
                    "9: Check stack Empty" +
                    "10: exit):");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 1:
                    System.out.println("Enter element to add:");
                    int addElement = Integer.parseInt(scanner.nextLine());
                    myList.push(addElement);
                    break;
                case 2:
                    System.out.println("Enter elements to add (comma or space-separated):");
                    String elementsInput = scanner.nextLine();
                    String[] addElements = elementsInput.split("[,\\s]+"); // Split by commas or spaces
                    for (String element : addElements) {
                        myList.push(Integer.parseInt(element.trim()));
                    }
                    break;
                case 3:
                    System.out.println("Element at top : " + myList.peek());
                    break;
                case 4:
                    System.out.println("Element at top POP : " + myList.pop());
                    break;

                case 5:
                    System.out.println("Enter element to search:");
                    int element = Integer.parseInt(scanner.nextLine());
                    System.out.println("Search Value :" + myList.search(element));
                    print(myList);
                    break;
                case 6:
                    System.out.println("Current list:");
                    print(myList);
                    break;
                case 7:
                    myList.clear();
                    break;
                case 8:
                    System.out.println("Current list size:" + myList.size());
                    break;
                case 9:
                    System.out.println("List Empty :" + myList.isEmpty());
                    break;
                case 10:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

        System.out.println("Exiting program.");
        scanner.close();
    }

    private static void print(MyStack<Integer> myList) {
        myList.forEach(x -> System.out.print(x + ","));
        System.out.println();
    }
}
