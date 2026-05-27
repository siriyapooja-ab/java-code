package module1programs;

import java.util.Scanner;

public class Switch_CaseForMonths 
{
	public static void main(String[] args) 
	{
		System.out.println("Select any number between 1-12");
		Scanner s1=new Scanner(System.in);
		
		int a=s1.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Its January");
			break;
		case 2:
			System.out.println("Its Fbruary");
			break;
		case 3:
			System.out.println("Its March");
			break;
		case 4:
			System.out.println("Its April");
			break;
		case 5:
			System.out.println("Its May");
			break;
		case 6:
			System.out.println("Its June");
			break;
		case 7:
			System.out.println("Its July");
			break;
		case 8:
			System.out.println("Its August");
			break;
		case 9:
			System.out.println("Its Septembery");
			break;
		case 10:
			System.out.println("Its October");
			break;
		case 11:
			System.out.println("Its November");
			break;
		case 12:
			System.out.println("Its December");
			break;
			
			default:
				System.out.println(" oops! Wrong selection .Please select again");
				
		}
		s1.close();
	}
}
