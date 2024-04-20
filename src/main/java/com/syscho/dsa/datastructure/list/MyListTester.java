package com.syscho.dsa.datastructure.list;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MyListTester {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter a command (1: add, 2: addMultiple, 3: delete, 4: deleteAll, 5: get, 6: print, 7: size, " +
                    "8: Check List Empty" +
                    "9: exit):");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 1:
                    System.out.println("Enter element to add:");
                    int addElement = Integer.parseInt(scanner.nextLine());
                    myList.add(addElement);
                    break;
                case 2:
                    System.out.println("Enter elements to add (comma or space-separated):");
                    String elementsInput = scanner.nextLine();
                    String[] addElements = elementsInput.split("[,\\s]+"); // Split by commas or spaces
                    for (String element : addElements) {
                        myList.add(Integer.parseInt(element.trim()));
                    }
                    break;
                case 3:
                    System.out.println("Enter index to delete:");
                    int deleteIndex = Integer.parseInt(scanner.nextLine());
                    myList.remove(deleteIndex);
                    break;
                case 4:
                    myList.removeAll();
                    break;
                case 5:
                    System.out.println("Enter index to get:");
                    int getIndex = Integer.parseInt(scanner.nextLine());
                    System.out.println("Element at index " + getIndex + ": " + myList.get(getIndex));
                    break;
                case 6:
                    System.out.println("Current list:");
                    print(myList);
                    break;
                case 7:
                    System.out.println("Current list size:" + myList.size());
                    break;
                case 8:
                    System.out.println("List Empty :" + myList.isEmpty());
                    break;
                case 9:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

        System.out.println("Exiting program.");
        scanner.close();
    }

    private static void print(MyList<Integer> myList) {
        myList.forEach(x -> System.out.print(x + ","));
        System.out.println();
    }
}
