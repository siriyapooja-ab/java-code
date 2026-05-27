package module1programs;

import java.util.Scanner;

public class IfElse_CenturyYear 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
		System.out.println(" Please Enter year");
		int y=s1.nextInt();
		
		if(y/100==1)
		{
			System.out.println("Year is a century year");
		}
		else
		{
			System.out.println("Year is not century year");
		}
	}	

}
