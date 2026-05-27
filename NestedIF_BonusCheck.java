package module1programs;

import java.util.Scanner;

public class NestedIF_BonusCheck 
{
	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter your salary");
	int salary=s1.nextInt();
	
	if(salary>=5000)
	{
		System.out.println("Please enter your years of experience");
		int exp=s1.nextInt();
	if(exp>5)
	{
		System.out.println("Hurray! you are eligible for bonus");
		
	}
	
	
	else
	{
		System.out.println("Sorry you ar not eligible for bonus");
	}
	}
}
}