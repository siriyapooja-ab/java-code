package module1programs;

import java.util.Scanner;
public class If_UsernamePw 
{
	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	String username="Admin";
	String Password="123456";
	System.out.println("Enter your username");
	String un=s1.next();
	if(un.equals(username))
	{
	System.out.println("Enter your password");
	String pw=s1.next();
	if(pw.equals(Password))
	{
		System.out.println("You are successfully logged in.");
	}
	else
	{
		System.out.println("Sorry  username or password is incorrect.Please try again with correct username and password");
	}
	}
}
}
