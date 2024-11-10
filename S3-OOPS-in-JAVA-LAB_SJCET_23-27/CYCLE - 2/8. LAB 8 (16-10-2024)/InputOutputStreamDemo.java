/*
 * EXPERIMENT - 11
 * File Exception Handling
 * */

package oopj24csb45;

import java.io.*;
import java.util.*;
public class InputOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File f1 = new File("numbers.txt");
		File f2 = new File("even.txt");
		File f3 = new File("odd.txt");
		try {
			f1.createNewFile();
			System.out.println(f1.getName()+" created\n");
			f2.createNewFile();
			System.out.println(f2.getName()+" created\n");
			f3.createNewFile();
			System.out.println(f3.getName()+" created\n");
			
			FileOutputStream fout = new FileOutputStream(f1);
			
			System.out.println("\nEnter the number of elements you want to store: ");
			int n = sc.nextInt();
			int a;
			
			String j;
			System.out.println("Enter the elements:");
			for (int i = 0; i < n; i++) 
			{
				a = sc.nextInt();
				j=String.valueOf(a);
                fout.write(j.getBytes());
                fout.write(" ".getBytes());
			}
			
			System.out.println("Data added\n");
			FileInputStream fin = new FileInputStream(f1);
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			FileOutputStream fout2 = new FileOutputStream(f2);
			FileOutputStream fout3 = new FileOutputStream(f3);
			
			String line;
			System.out.println("contents of "+f1.getName()+" is:");
			while((line=br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while(st.hasMoreTokens()) {
					String number=st.nextToken();
					System.out.print(number+" ");
					int num=Integer.parseInt(number);
					if(num%2==0) {
						fout2.write(number.getBytes());
						fout2.write(" ".getBytes());
					}
					else {
						fout3.write(number.getBytes());
						fout3.write(" ".getBytes());
					}
				}
			}
			System.out.println("\nEven and odd numbers have been separated into even.txt and odd.txt");
			fout.close();
			fout2.close();
			fout3.close();
			FileInputStream fin2 = new FileInputStream(f2);
			FileInputStream fin3 = new FileInputStream(f3);
			System.out.println("contents of even.txt is:");
			BufferedReader br2=new BufferedReader(new InputStreamReader(fin2));
			while((line=br2.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println("contents of odd.txt is:");
			BufferedReader br3=new BufferedReader(new InputStreamReader(fin3));
			while((line=br3.readLine())!=null) {
				System.out.println(line);
			}
			fin2.close();
			fin3.close();
			} catch (IOException e) {
				System.out.println("An error Occured");
		}
	}
}