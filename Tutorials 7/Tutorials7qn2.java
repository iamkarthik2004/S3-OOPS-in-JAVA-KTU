/*
TUTORIALS 7
MODULE - 2
INHERITANCE IN JAVA

2. Write a Java program to implement Multilevel Inheritance 
Implement a class hierarchy for different types of vehicles. 
Classes: 
Vehicle: Base class with attributes like model and year. 
Car: Derived class from Vehicle with additional attributes like numberOfDoors. 
ElectricCar: Further derived class from Car with attributes like batteryCapacity. 
 Design a hierarchy of employee types within a company.

Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials7;

class Vehicle {
    String Model;
    int Year;

    void vehicle() {
        System.out.println("\nModel: " + Model);
        System.out.println("Year: " + Year);
    }
}

class Car extends Vehicle {
    int No_of_Doors;

    void doors() {
        System.out.println("Number of Doors: " + No_of_Doors);
    }
}

class ElectricCar extends Car {
    int Battery_Capacity;

    ElectricCar(String Model, int Year, int No_of_Doors, int Battery_Capacity) {
        this.Model = Model;
        this.Year = Year;
        this.No_of_Doors = No_of_Doors;
        this.Battery_Capacity = Battery_Capacity;
    }

    void battery() {
        System.out.print("Battery Capacity: " + Battery_Capacity + "\n");
    }
}

public class Tutorials7qn2{
    public static void main(String[] args) {
        ElectricCar c1 = new ElectricCar("Audi e-tron GT RS", 2021, 4, 7230);
        ElectricCar c2 = new ElectricCar("BMW i7 M70 xDrive", 2024, 4, 7000);
        c1.vehicle();
        c1.doors();
        c1.battery();
        
        c2.vehicle();
        c2.doors();
        c2.battery();
    }
}


