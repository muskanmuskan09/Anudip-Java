/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author muska
 */
public class Employee {

    // Fields of the Employee class
    String name = "abc";
    String dept = "cse";
    int id = 12;
    int sal = 12300;

    // Default constructor
    Employee() {
        System.out.println("info about employee");
    }

    // Parameterized constructor
    Employee(int id, int sal, String name, String dept) {
        this.id = id;
        this.name = name;
        this.sal = sal; // Fixed the parameter name from sa1 to sal
        this.dept = dept;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + sal);
        System.out.println("Department: " + dept);
    }

    // Main method
    public static void main(String[] args) {
        Employee obj = new Employee(892, 500000, "Muskan", "cse");
        obj.display();
    }
}

// Output:
//Name: Muskan
//ID: 892
//Salary: 500000
//Department: cse
