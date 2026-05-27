package module1programs;

import java.util.Scanner;

public class ForLoop_Scanner 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			Scanner s1=new Scanner(System.in);
			
			System.out.println("Enter your name");
			String name=s1.next();
			
			System.out.println("Enter you age");
			int age=s1.nextInt();
			
			System.out.println(name);
			System.out.println(age);
			
		}
	}
}
