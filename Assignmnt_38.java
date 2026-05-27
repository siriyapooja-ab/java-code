package module1programs;

public class Assignmnt_38
{
	int a=20;
	static int b=30;
	public static void main(String[] args) 
	{
		b=50;
		Assignmnt_38 s=new Assignmnt_38();
		
		s.a=100;
		System.out.println("Updated variable is=>"+b);
		System.out.println("Updated non static variable is=>"+s.a);
		
		
	}
}
