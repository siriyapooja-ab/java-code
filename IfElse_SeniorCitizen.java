package module1programs;

import java.util.Scanner;

class IfElse_SeniorCitizen 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age =s1.nextInt();
		
		if(age>=60)
		{
			System.out.println("Congratulations! you can avail the discount");
		}
		else
		{
			System.out.println("Sorry your age is less than 60 so you are not eigible to avail the discount");
		}
	}
}
