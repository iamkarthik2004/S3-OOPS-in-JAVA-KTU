/*EXPERIMENT 5
Hierarchical inheritance

09-08-2024 
FRIDAY

KARTHIK KRISHNAN
CSE - B
ROLL NO: 45
*/

package oopj24csb45;
import java.util.Scanner;

class Employee
{
	String name;
	int Age;
	int Salary;
	String address;
	long phone_num;
	
	void PrintEmployee()
	{
		System.out.println("\nName: " + name);
		System.out.println("\nAge: " + Age);
		System.out.println("\nAddress: " + address);
		System.out.println("\nPhone Number: " + phone_num);
	}
	
	
	
	void PrintSalary()
	{
		System.out.println("Salary: " + Salary);
	}
	
}

class Officer extends Employee
{
	String Specilization = new String();
	
	void PrintSpecilization()
	{
		System.out.println("Specilization: " + Specilization);
	}
}



class Manager extends Employee
{
	String Department = new String();
	
	void PrintDepartment()
	{
		System.out.println("Department: " + Department);
	}
	
}


public class EmployeeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Officer of=new Officer();
		Manager ma=new Manager();
		
		//Officer
		System.out.println("Enter the Officer's Name: ");
		of.name=sc.nextLine();
		
		System.out.println("Enter the Address: ");
		of.address=sc.nextLine();
		
		System.out.println("Enter Specilization: ");
		of.Specilization=sc.next();
		
		System.out.println("Enter the Age: ");
		of.Age=sc.nextInt();
		
		System.out.println("Enter the Phone Number: ");
		of.phone_num=sc.nextLong();
		
		System.out.println("Enter the Salary: ");
		of.Salary=sc.nextInt();
		sc.nextLine();
		//Manager
		System.out.println("Enter the Manager's Name: ");
		ma.name=sc.nextLine();
		
		System.out.println("Enter the Address: ");
		ma.address=sc.nextLine();
		
		System.out.println("Enter Department: ");
		ma.Department=sc.nextLine();
		
		System.out.println("Enter the Age: ");
		ma.Age=sc.nextInt();
		
		System.out.println("Enter the Phone Number: ");
		ma.phone_num=sc.nextLong();
		
		System.out.println("Enter the Salary: ");
		ma.Salary=sc.nextInt();
		
		sc.close();
		System.out.println("\nOFFICER DETAILS:");
		of.PrintEmployee();
		of.PrintSalary();
		of.PrintSpecilization();
		
		System.out.println("\nMANAGER'S DETAILS:");
		ma.PrintEmployee();
		ma.PrintSalary();
		ma.PrintDepartment();
		
		
	
 
	}

}
