/*
TUTORIALS 7
MODULE - 2
INHERITANCE IN JAVA

3. Write a Java program to implement Hierarchical Inheritance 
Design a hierarchy of employee types within a company. 
Classes: 
Employee: Base class with common attributes and methods. 
FullTimeEmployee: Derived class from Employee with additional attributes like 
annualSalary. 
PartTimeEmployee: Another derived class from Employee with attributes like hourlyRate.

Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials7;

import java.util.Scanner;

class Employee1 
{
    String name;
    int employeeID;
    double salary;

    void printEmployee() 
    {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
    }

    void printSalary() 
    {
        System.out.println("Annual Salary: " + salary);
    }
}

class Full extends Employee1 
{
    String department = new String();

    
    void printDepartment() {
        System.out.println("Department: " + department);
    }
}

class PartTime extends Employee1 
{
    double hourlyRate;
    String department = new String();

    void printHourlyRate() 
    {
        System.out.println("Hourly Rate: " + hourlyRate);
    }

    void printDepartment() 
    {
        System.out.println("Department: " + department);
    }
}

public class Tutorials7qn3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Full ft = new Full();
        PartTime pt = new PartTime();

        // Full-Time Employee
        System.out.println("Enter the Full-Time Employee ID: ");
        ft.employeeID = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the Full-Time Employee Name: ");
        ft.name = sc.nextLine();

        System.out.println("Enter Department: ");
        ft.department = sc.nextLine();

        System.out.println("Enter the Annual Salary: ");
        ft.salary = sc.nextDouble();
        sc.nextLine(); 

        // Part-Time Employee
        System.out.println("Enter the Part-Time Employee ID: ");
        pt.employeeID = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Part-Time Employee Name: ");
        pt.name = sc.nextLine();

        System.out.println("Enter Department: ");
        pt.department = sc.nextLine();

        System.out.println("Enter the Hourly Rate: ");
        pt.hourlyRate = sc.nextDouble();

        sc.close();

        System.out.println("\nFull-Time Employee Details:");
        ft.printEmployee();
        ft.printDepartment();
        ft.printSalary();

        System.out.println("\nPart-Time Employee Details:");
        pt.printEmployee();
        pt.printDepartment();
        pt.printHourlyRate();
    }
}

