/*
 EXPERIMENT - 12
 File handling program in Java with FileReader/FileWriter
 Date - 04/10/2024
 */

package oopj24csb45;
import java.io.*;
import java.util.*;
public class FileHandlingDemo
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			File f=new File("sample.txt");
			if(f.exists()) 
			{
				System.out.println("Sample.txt exists");
			}
			else 
			{
				f.createNewFile();
				System.out.println("sample.txt created");
			}
			
			System.out.println("Enter the string:");
			String s=sc.nextLine();
			FileWriter f1=new FileWriter(f);
			f1.write(s);
			f1.close();
			
			System.out.println("Content written to sample.txt");
			File fn=new File("newsample.txt");
			if(fn.exists()) 
			{
				System.out.println("newsample.txt exists");
			}
			else 
			{
				fn.createNewFile();
				System.out.println("newsample.txt created");
				}
			
			System.out.println("-------Contents of Sample.txt-------\n");
			FileReader f2=new FileReader(f);
			FileWriter f3=new FileWriter(fn);
			
			int i;
			while((i=f2.read())!=-1) 
			{
				System.out.print((char)i);
				f3.write(i);
			}
			f2.close();
			f3.close();
			
			System.out.println("\nContents copied from sample.txt to newsample.txt\n");
			FileReader f4=new FileReader(fn);
			System.out.println("-------Content of newsample.txt-------");
			
			int j;
			while((j=f4.read())!=-1)
			{
				System.out.print((char)j);
			}
			f4.close();
		}
		catch(Exception e) 
		{
			System.out.println("An error occured:"+e.getMessage());	
		}
		

	}

}