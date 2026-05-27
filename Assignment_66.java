package module1programs;

import java.util.Scanner;
public class Assignment_66
{
	

	

	
		public static void main(String[] args) 
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter a number");
		
		int a=s1.nextInt();
		if(a>=90)
		{
			System.out.println("Congratulations you have passed with Grade A");
		}
		if(a>=75 && a<=89)
		{
			System.out.println("Congratulation you have passed with grade B");
		}
		if(a>=54 && a<=74)
		{
			System.out.println("you have passed with grade C ");
		}
		else if(a<54)
		{
			System.out.println("Sorry you have failed .Please try in next attempt");
		}
		}
	}


