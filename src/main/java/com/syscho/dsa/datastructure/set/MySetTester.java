package com.syscho.dsa.datastructure.set;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class MySetTester {

    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter a command (1: add, 2: addAll, 3: remove, 4: contains, 5: size, 6: isEmpty, 7: print, 8: exit):");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 1:
                    System.out.println("Enter element to add:");
                    int addElement = Integer.parseInt(scanner.nextLine());
                    boolean added = mySet.add(addElement);
                    System.out.println("Element added: " + added);
                    break;
                case 2:
                    System.out.println("Enter elements to add (comma or space-separated):");
                    String elementsInput = scanner.nextLine();
                    String[] addElements = elementsInput.split("[,\\s]+"); // Split by commas or spaces
                    Collection<Integer> additionalElements = Arrays.asList(addElements).stream()
                            .map(Integer::parseInt)
                            .toList();
                    boolean addedAll = mySet.addAll(additionalElements);
                    System.out.println("Elements added: " + addedAll);
                    break;
                case 3:
                    System.out.println("Enter element to remove:");
                    int removeElement = Integer.parseInt(scanner.nextLine());
                    boolean removed = mySet.remove(removeElement);
                    System.out.println("Element removed: " + removed);
                    break;
                case 4:
                    System.out.println("Enter element to check if present:");
                    int checkElement = Integer.parseInt(scanner.nextLine());
                    boolean contains = mySet.contains(checkElement);
                    System.out.println("Set contains element: " + contains);
                    break;
                case 5:
                    System.out.println("Set size: " + mySet.size());
                    break;
                case 6:
                    System.out.println("Is set empty? " + mySet.isEmpty());
                    break;
                case 7:
                    System.out.println("Elements in the set:");
                    mySet.forEach(System.out::println);
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

        System.out.println("Exiting program.");
        scanner.close();
    }
}
