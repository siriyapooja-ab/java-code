package module1programs;

import java.util.Scanner;

public class Switch_Case2 
{
public static void main(String[] args) 
{
	System.out.println("Please select opion 1,2,3,4 for selecting browser");
	
	Scanner s1=new Scanner(System.in);
	int a=s1.nextInt();
	switch(a)
	{
	case 1:
		System.out.println("Welcome to Crome browser");
		break;
		
	case 2:
		System.out.println("Welcome to  Firefox browser");
		break;
		
	case 3:
		System.out.println("Welcome to  Mozilla browser");
		break;
		
	case 4:
		System.out.println("Welcome to  Edge browser");
		
		break;
		
	}
}
}
