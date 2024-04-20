package com.syscho.dsa.datastructure.set;

public class MySetEmpTester {

    public static void main(String[] args) {
        MySet<Employee> employeeSet = new MySet<>();

        // Adding employees
        employeeSet.add(new Employee(1, "John Doe"));
        employeeSet.add(new Employee(2, "Jane Smith"));
        employeeSet.add(new Employee(3, "Alice Johnson"));

        // Removing an employee
        Employee removeEmployee = new Employee(2, ""); // Dummy employee with ID
        boolean removed = employeeSet.remove(removeEmployee);
        System.out.println("Employee removed: " + removed);

        // Checking if an employee is present
        Employee checkEmployee = new Employee(3, ""); // Dummy employee with ID
        boolean contains = employeeSet.contains(checkEmployee);
        System.out.println("Set contains employee: " + contains);

        // Adding more employees
        employeeSet.add(new Employee(4, "Bob Johnson"));
        employeeSet.add(new Employee(5, "Eve Brown"));

        // Printing all employees in the set
        System.out.println("Employees in the set:");
        employeeSet.forEach(System.out::println);

        // Checking the size of the set
        System.out.println("Set size: " + employeeSet.size());

        // Checking if the set is empty
        System.out.println("Is set empty? " + employeeSet.isEmpty());
    }

    // Employee class definition
    static class Employee {
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
