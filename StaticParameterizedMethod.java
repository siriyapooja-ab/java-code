package module1programs;

public class StaticParameterizedMethod 
{
	static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
	}
	static void multiply(double a,int b)
	{
		double mul=a*b;
		System.out.println(mul);
	}
	static void subs(int a,int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args)
	{
		add(100,200);
		subs(50,25);
		multiply(10,20);

	}

}
