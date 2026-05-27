package module1programs;

import java.util.Scanner;
public class ElectricBillCalculate 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter total units");
	int a=s.nextInt();
	
	if(a<=100)
	{
		System.out.println("Your total electricity bill is =>"+a*5);
	}
	if(a>100)
	{
		System.out.println("Your total electricity bill is =>"+a*10);
	}
	s.close();
}
}
