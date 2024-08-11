/*
TUTORIALS 7
MODULE - 2
INHERITANCE IN JAVA

1. Write a Java program to implement Single Inheritance 
Create a simple application to manage employees and managers. 
Classes: 
Employee: Base class with attributes like name and employeeID. 
Manager: Derived class that extends Employee, with additional attributes like 
department and methods to manage employees. 


Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials7;
import java.util.Scanner;

class Employee {
    String name;
    int E_id;
}

class Manager extends Employee {
    String department;

    void details() {
        System.out.println(E_id + "\t" + name + "\t" + department);
    }
}

public class Tutorials7qn1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager ma = new Manager();

        System.out.println("Enter the Name: ");
        ma.name = sc.nextLine();
        System.out.println("Enter the Department: ");
        ma.department = sc.nextLine();
        System.out.println("Enter the Employee ID: ");
        ma.E_id = sc.nextInt();

        System.out.println("Manager details: ");
        System.out.println("E_id\tName\tDepartment");
        ma.details();
    }
}


