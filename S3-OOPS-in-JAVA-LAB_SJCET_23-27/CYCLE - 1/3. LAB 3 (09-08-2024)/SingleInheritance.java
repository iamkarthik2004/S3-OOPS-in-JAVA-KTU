/*EXPERIMENT 5
Single Inheritance

09-08-2024 
FRIDAY

KARTHIK KRISHNAN
CSE - B
ROLL NO: 45
*/


package oopj24csb45;
import java.util.Scanner;

class employee
{
	int salary;
	
	void display()
	{
		System.out.println("My Class is Employee: ");
	}
	
	void calsalary()
	{
		System.out.println("Employee Salary: " + salary);
	}
	
}


class engineer extends employee
{
	void calsalary()
	{
		System.out.println("Engineer Salary: " +2*salary);
	}
	
}



public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		engineer e = new engineer();
		System.out.println("Enter the Salary of the Engineer: ");
		e.salary=sc.nextInt();
		e.display();
		e.calsalary();
		

	}

}
