package module1programs;

public class Assignment5 
{


	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	
	static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		
	}
	void mul(double a,int b)
	{
		double c=a*b;
		System.out.println(c);
	}
	
	void div(double a,double b)
	{
		double c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		 add(10,20);
		 sub(40,10);
		 
		 Assignment5 A=new Assignment5();
		 A.mul(10.3,4);
		 A.div(10.3, 5);
		 
		 
		 
		 
		 
		
	}
}



