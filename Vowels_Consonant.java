package module1programs;

import java.util.Scanner;

public class Vowels_Consonant 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the char");
		
		Scanner s1=new Scanner(System.in);
		char ch=s1.next().charAt(0);
		
		
			if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					{
					System.out.println("The given char is a vowel");
					}
		
		else
			{
				System.out.println("The given char is consonant");
			}
			
			s1.close();
		}
		
	}
	

