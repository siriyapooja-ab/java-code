package module1programs;

public class MethodOverloading 
{
	static void add(int a,int b,int c)
	{
		
		System.out.println("Addition of three numbers is="+(20+30+40));
	}
	
	static void add(int a,int b)
	{
		System.out.println("Addition of int numbers is="+(20+30));
	}
	
	static void add(double a,int b)
	{
		System.out.println("Addition of int and doble numbers is="+(20+30));
	}
	public static void main(String[] args) 
	{
		add(10,20,30);
		add(10,20);
		add(20.5,30);
	}
}
