package module1programs;
import java.util.Scanner;
public class IfElse_Scanner 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter your age");
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible for voting ");
		}
		
		else
		{
			System.out.println("You are not eligible for voting as age is less than 18");
		}
		
		s1.close();
		
		
	}
}
