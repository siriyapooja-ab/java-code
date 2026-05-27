package module1programs;

import java.util.Scanner;
public class Switch_Case3 
{
	public static void main(String[] args) 
	{		
		System.out.println("Enter option between (1-7)");
		Scanner s1=new Scanner(System.in);
		
		int a=s1.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			
		case 5:
			System.out.println("Friday");
			
		case 6:
			System.out.println("Saturday");
			
		case 7:
			System.out.println("Sunday");
			
			break;
	}
	}
}