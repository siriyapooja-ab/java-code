package module1programs;

import java.util.Scanner;

public class SI_MathNSca 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter value of Principal amount");
	int P=s1.nextInt();
	
	System.out.println("Enter the Rate of Interest");
	int R=s1.nextInt();
	
	System.out.println("Enter the Time ");
	int T=s1.nextInt();
	
	int a=P*R*T;
	
	int SI=Math.divideExact(a, 100);
	
	System.out.println(SI);
	
	
}
}
