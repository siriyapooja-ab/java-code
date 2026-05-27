package module1programs;

import java.util.Scanner;
public class LargestNo
{
	public static void main(String[] args) 
	{
		Scanner  s=new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int a=s.nextInt();
		
		System.out.println("Please enter second number");
		int b=s.nextInt();
		
		int c=Math.max(a, b);
		
		System.out.println("The larges of given number i=>"+c);
		
	}

}
