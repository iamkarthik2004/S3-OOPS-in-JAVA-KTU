/*
EXPERIMENT 8
KARTHIK KRISHNAN
23-08-2024
CSE B
ROLL: 45
*/

package oopj24csb45;

abstract class Animal
{
	protected int legs;
	Animal (int legs)
	{
		this.legs=legs;
	}
	void walk()
	{
		System.out.println("Animal Walks by " + legs + " legs");
	}
	
}


class Spider extends Animal
{
	Spider (int legs)
	{
		super(legs);
	}
	void eat()
	{
	System.out.println("Spider eats insects");
	}
}


interface Pet
{
	abstract void getname();
	abstract void setname(String name);
	abstract void play();
}

class Cat extends Animal implements Pet
{
	String name;
	Cat(String name, int legs)
	{
		super(legs);
		this.name=name;
	}
	public void getname()
	{
		System.out.println("The Cat's Name is " + name);
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void play()
	{
		System.out.println("The Cat Plays with Rat");
	}
	void eat()
	{
	System.out.println("Cat eats Fishes");
	}
}


class Fish extends Animal implements Pet
{
	String name;
	Fish(String name)
	{
		super(0);
		this.name=name;
	}
	public void getname()
	{
		System.out.println("The Fish's Name is " + name);
	}

	public void setname(String name)
	{
		System.out.println("The Fish's Name is " + name);
	}
	public void play()
	{
		System.out.println("The Fish is play in Water");
	}
	public void eat()
	{
	System.out.println("Fish eats Plants");
	}
	public void walk()
	{
		System.out.println("Fish have no legs");
	}
}

public class InterfaceDemo
{


	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("SPIDER");
		Spider ob = new Spider(8);
		ob.eat();
		ob.walk();
		
		System.out.println("\nCAT");
		Cat c = new Cat("FLUFFY",4);
		c.getname();
		c.setname("MOOSE");
		c.walk();
		c.eat();
		c.play();
		c.getname();
		
		System.out.println("\nFISH");
		Fish f = new Fish("MIMI");
		f.getname();
		f.walk();
		f.eat();
		f.setname("MOMO");
		
		
	}

}
