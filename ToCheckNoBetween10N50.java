package module1programs;

import java.util.Scanner;
public class ToCheckNoBetween10N50 
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
		System.out.println("Please enter  a number");
		int a=s1.nextInt();
		
		if(a<=50)
		{
			System.out.println("Correct number");
		}
		else
		{
			System.out.println("Wrong number");
		}

}
}

