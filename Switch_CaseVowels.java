package module1programs;

import java.util.Scanner;

public class Switch_CaseVowels 
{
	public static void main(String[] args) 
	{
		System.out.println("Select any alphabet between(A-Z) OR (a-z)");
		Scanner s1=new Scanner(System.in);
		
		char ch=s1.next().charAt(0);
		switch(ch)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
			System.out.println("Its a Vowel");
			break;
			
			default:
				System.out.println("Is a consonant");
				
		}
		s1.close();
			
		}
		
		
		
	


}
