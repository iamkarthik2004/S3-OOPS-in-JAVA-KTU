/*EXPERIMENT 6
Abstract Class Implementation

16-08-2024 
FRIDAY

KARTHIK KRISHNAN
CSE - B
ROLL NO: 45
*/


import java.util.Scanner;

abstract class shape
{
    int side, angle;
    
    abstract void No_Of_Sides();
}

class Triangle extends shape
{
    int side, angle;
    
    Triangle(int side)
    {
        this.side=side;
    }
    
    void No_Of_Sides()
    {
        System.out.println("Shape with " + side + " sides:");
        System.out.println("I am Triangle. I have " + side + " sides.");
        angle = (side-2)*180;
        System.out.println("Sum of Angles =" + angle);
    }
}

class Rectangle extends shape
{
    int side, angle;
    
    Rectangle(int side)
    {
        this.side=side;
    }
    
    void No_Of_Sides()
    {
        System.out.println("Shape with " + side + " sides:");
        System.out.println("I am Rectangle. I have " + side + " sides");
        angle = (side-2)*180;
        System.out.println("Sum of Angles =" + angle);
    }
}

class Hexagon extends shape
{
    int side, angle;
    
    Hexagon(int side)
    {
        this.side=side;
    }
    
    void No_Of_Sides()
    {
        System.out.println("Shape with " + side + " sides:");
        System.out.println("I am Rectangle. I have " + side + " sides");
        angle = (side-2)*180;
        System.out.println("Sum of Angles =" + angle);
    }
}

public class AbstractClassDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        do
        {
            System.out.println("Enter the number of sides for the geometric Shape: ");
            int sides = sc.nextInt();
            
            if(sides==3)
            {
                Triangle t = new Triangle(sides);
                t.No_Of_Sides();
            }
            
            else if(sides==4)
            {
                Rectangle r = new Rectangle(sides);
                r.No_Of_Sides();
            }
            
            else if(sides==6)
            {
                Hexagon h = new Hexagon(sides);
                h.No_Of_Sides();
            }
            
            else
            {
                System.out.println("Shape with " + sides + " is not supported");
            }
            System.out.println("Do You Want to Continue (Y/N) ");
            ch=sc.next().charAt(0);
        }
        while(ch=='Y' || ch=='y');
        System.out.println("Exiting. GoodBye!");
    }
}


