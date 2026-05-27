package module1programs;

public class Static5AndNonStatic5 
{
	static void mul()
	{
	System.out.println("This is Static method 1");
	}
	
	static void mul(int a)
	{
	System.out.println("This is Static method 2");
	}
	
	static void mul(int a,int b)
	{
	System.out.println("This is Static method 3");
	}
	
	static void mul(double a,double b)
	{
	System.out.println("This is Static method 4");
	}
	
	static void mul(double a,int b)
	{
	System.out.println("This is Static method 5");
	}
	
	void mul(int a,int b,int c)
	{
		
		System.out.println("Addition of three numbers is="+(20+30+40));
	}
	
	 void mul(int a,int b ,double c)
	{
		System.out.println("Addition of int numbers is="+(20+30));
	}
	
	 void mul(double a,int b,double c)
	{
		System.out.println("Addition of int and doble numbers is="+(20+30));
	}
	
	 void mul(double a,double b,double c)
	{
		System.out.println("Addition of int and doble numbers is="+(20+30));
	}
	 void mul(double a,int b,int c)
	{
		System.out.println("Addition of int and doble numbers is="+(20+30));
	}
	
	 public static void main(String[] args) 
	{
		mul();
		mul(10);
		mul(10,20);
		mul(10.5,20.6);
		mul(10.4,40);
		
		Static5AndNonStatic5 s1=new Static5AndNonStatic5 ();
		s1.mul(10, 20, 30);
		s1.mul(10.2, 20.4, 30.4);
		s1.mul(10.6,20,10.6);
		s1.mul(10,10,20.7);
		s1.mul(20.3, 30, 83);
		
	}
}
