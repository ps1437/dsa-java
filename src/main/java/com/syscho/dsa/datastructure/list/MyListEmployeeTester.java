package com.syscho.dsa.datastructure.list;

import com.syscho.dsa.datastructure.Employee;

public class MyListEmployeeTester {

    public static void main(String[] args) {
        MyList<Employee> employeeList = new MyList<>();

        // Adding some sample employees to the list
        employeeList.add(new Employee(1, "John Doe"));
        employeeList.add(new Employee(2, "Jane Smith"));
        employeeList.add(new Employee(3, "Alice Johnson"));

        System.out.println("All Employees:");
        printAllEmployees(employeeList);

        // Adding a new employee
        Employee newEmployee = new Employee(4, "Bob Johnson");
        employeeList.add(newEmployee);
        System.out.println("Employee added: " + newEmployee);

        // Deleting an employee at index 1
        Employee deletedEmployee = employeeList.remove(1);
        if (deletedEmployee != null) {
            System.out.println("Deleted Employee: " + deletedEmployee);
        } else {
            System.out.println("Invalid index.");
        }

        // Getting an employee at index 2
        Employee retrievedEmployee = employeeList.get(2);
        if (retrievedEmployee != null) {
            System.out.println("Employee at index 2: " + retrievedEmployee);
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("All Employees:");
        printAllEmployees(employeeList);
    }

    private static void printAllEmployees(MyList<Employee> employeeList) {
        employeeList.forEach(employee -> System.out.println(employee));
    }


}
