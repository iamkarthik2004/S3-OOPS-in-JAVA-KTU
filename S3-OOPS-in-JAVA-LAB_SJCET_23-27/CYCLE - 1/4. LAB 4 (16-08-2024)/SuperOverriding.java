/*EXPERIMENT 7
Usage of super and overriding
Inheritance and Usage of super

16-08-2024 
FRIDAY

KARTHIK KRISHNAN
CSE - B
ROLL NO: 45
*/

import java.util.Scanner;

class Employee2
{
    int bs, da, hra, salary, GrossSalary;

    Employee2(int bs, int hra, int da)
    {
        this.bs=bs;
        this.da=da;
        this.hra=hra;
    }

    void display()
    {
        System.out.println("\n....EMPLOYEE....");
    }

    void calsalary()
    {
        GrossSalary = bs + (bs*da/100) + (bs*hra/100);
        system.out.println("The Gross Salary of the Employee is: " + GrossSalary);
    }
}

class Engineer2 extends Employee2
{
    Engineer2(int bs, int hra, int da)
    {
        super(bs, hra, da);
    }
    
    void display()
    {
        super.display();
        super.calsalary();
        System.out.println("\n....ENGINEER.....");
    }
    
    void calsalary()
    {
        System.out.println("The Gross Salary of the Engineer is: " + 2*GrossSalary);
    }
}

public class SuperOverriding
{
    public static void main(String args[])
    {
        int bs, da, hra;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Basic Salary of the Employee: ");
        bs=sc.nextInt();
        
        System.out.println("Enter the DA % of the Employee: ");
        da=sc.nextInt();
        
        System.out.println("Enter the HRA % of the Employee: ");
        hra=sc.nextInt();
        
        Engineer2 ob = new Engineer2(bs, hra, da);
        
        ob.display();
        ob.calsalary();
    }
}
