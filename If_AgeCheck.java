package module1programs;

import java.util.Scanner;
public class If_AgeCheck 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter our age");
		double age=s1.nextDouble();
		
		if(age<5)
		{
			System.out.println("Ticket is free for kids");
		}
			else if(age<=10)
			{
				System.out.println("You have to pay 10% of the total ticket");
			}
		
			
			else
			{
				System.out.println("Enter your gender");
				String gen=s1.next();
			
			
		
		
				if(gen.equalsIgnoreCase("female"))
				{
					System.out.println("Do you have adhar card?");
					
					
					String ad=s1.next();
					if(ad.equalsIgnoreCase("Yes"))
					{
						System.out.println("Congratulations you got free tickects");
			
					}
					else
						{
							System.out.println("You have to pay full ticket");
						}
			}
		
				else if(gen.equalsIgnoreCase("Male"))
				{
				
					if(age>60)
					{
			
	
						System.out.println("You got 50% off");
					}
					else
					{
						System.out.println("You need to pay full ticket");
					}
				}
			
			
				
			
		}
		
	
		}
	}
	

