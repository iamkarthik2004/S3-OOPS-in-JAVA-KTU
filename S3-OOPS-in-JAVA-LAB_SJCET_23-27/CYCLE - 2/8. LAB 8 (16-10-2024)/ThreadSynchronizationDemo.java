package oopj24csb45;

import java.util.*;

class AddTab extends Thread

{

	int num;

	AddTab(int num)

	{

		this.num=num;

	}

	public void run()

	{

		synchronized(AddTab.class)

		{

		for(int i=1; i<=10; i++)

			{

				System.out.println(num + " + " + i + " = " + (num + i));

			}

		}

		

	}

}


public class ThreadSynchronizationDemo 

{

	public static void main(String[] args) 

	{

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Table you want to run by thread1");

		int n1 = sc.nextInt();

		

		System.out.println("Enter the Table you want to run by thread2");

		int n2 = sc.nextInt();

		

		System.out.println("Enter the Table you want to run by thread3");

		int n3 = sc.nextInt();

		

		AddTab t1 = new AddTab(n1);

		AddTab t2 = new AddTab(n2);

		AddTab t3 = new AddTab(n3);


		t1.start();

		t2.start();

		t3.start();

		
		sc.close();

	}



}