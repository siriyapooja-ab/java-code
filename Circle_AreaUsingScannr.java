package module1programs;

import java.util.Scanner;

public class Circle_AreaUsingScannr 
{
	public static void main(String[] args)
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Please entr value of r");
		double r =s1.nextDouble();
		
		double area=Math.PI*r*r;
		System.out.println("Area of circle is="+area);
	}
}
