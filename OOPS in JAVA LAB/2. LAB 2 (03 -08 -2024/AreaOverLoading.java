/*EXPERIMENT 4
01 - 08 - 2024
FRIDAY

KARTHIK KRISHNAN
S3 CSE B
ROLL: 45
*/


package oopj24csb45;
import java.util.*;

public class AreaOverLoading 
{
	
public double area(double base, double height) 
{
	return 0.5*base*height;
}
public int area(int length,int width)
{
	return length*width;
}
public double area(int radius)
{
	return 3.14*radius*radius;
}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		AreaOverLoading tri = new AreaOverLoading();
		AreaOverLoading rect = new AreaOverLoading();
		AreaOverLoading circ = new AreaOverLoading();
		
		System.out.println("Enter the base and height of the triangle: ");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Enter the width and length of the Rectangle: ");
		int width = sc.nextInt();
		int length = sc.nextInt();
		System.out.println("Enter the Radius of the Circle: ");
		int radius = sc.nextInt();
		
		double trianglearea=tri.area(base, height);
		int rectanglearea=rect.area(width, length);
		double circlearea=circ.area(radius);
		
		System.out.println("Area of the Triangle is " + trianglearea);
		System.out.println("Area of the Rectangle is " + rectanglearea);
		System.out.println("Area of the Circle is " + circlearea);


	}

}
