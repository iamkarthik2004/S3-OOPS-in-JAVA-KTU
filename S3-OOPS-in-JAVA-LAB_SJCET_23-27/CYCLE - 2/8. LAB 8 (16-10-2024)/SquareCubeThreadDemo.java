package oopj24csb45;
import java.util.Random;

class SquareThread extends Thread
{
	int num;
	SquareThread(int num)
	{
		this.num=num;
	}
	public void run()
	{
		square = num*num
		System.out.println("Square of " + num + " = " + square);
	}
}

class CubeThread extends Thread
{
	int num;
	CubeThread(int num)
	{
		this.num=num;
	}
	public void run()
	{
		cube = num*num*num
		System.out.println("Cube of " + num + " = " + cube);
	}
	
}
class RandThread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			Random robj = new Random();
			int randomnum=robj.nextInt(100);
			
			if(randomnum%2==0)
			{
				SquareThread s = new SquareThread(randomnum);
				s.start();
			}
			else
			{
				CubeThread c = new CubeThread(randomnum);
				c.start();
			}
			
		}
		
	}
	
}

public class SquareCubeThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandThread1 r = new RandThread1();
		r.start();

	}

}
