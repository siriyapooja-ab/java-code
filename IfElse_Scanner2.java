package module1programs;

import java.util.Scanner;

public class IfElse_Scanner2 

{
public static void main(String[] args)
{
	System.out.println("Please enter the number");
	
	Scanner s1=new Scanner(System.in);
	double a=s1.nextInt();
	
	if (a/2==0)
	{
		System.out.println("The number is even");
	}
	else 
	{
		System.out.println("The number is odd");
	}
}
}
