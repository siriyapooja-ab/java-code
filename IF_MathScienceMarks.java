package module1programs;

import java.util.Scanner;
public class IF_MathScienceMarks
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your total marks");
		int m=s1.nextInt();

		
		if(m>=90)
		{
			System.out.println("Please enter your marks of maths");
			int n=s1.nextInt();
			System.out.println("Please enter marks of science");
			int n1=s1.nextInt();
			
			if(n>90 && n1>90)
			{
			System.out.println("You have passed with A+ grade");
			}
			else 
			{
				System.out.println("You have passed with A grade ");
			}
		}
		
		
		else if(m<90 && m>80)
		{
			System.out.println("Please enter your marks of maths");
			int n=s1.nextInt();
			System.out.println("Please enter marks of science");
			int n1=s1.nextInt();
			
			if(n>90 && n1>90)
			{
				System.out.println("You have passed with B+ grade");
				
			}
			else 
			{
				System.out.println("You have passed with B grade ");
			}
			
			s1.close();
		}
	}
}
