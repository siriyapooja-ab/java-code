package module1programs;

public class StatAndNonParaMethOV
{
	static void add(int a,int b,int c)
	{
		
		System.out.println("Addition of three numbers is="+(20+30+40));
	}
	
	static void add(double a,int b)
	{
		System.out.println("Addition of int numbers is="+(20+30));
	}
	
	void add(int a,int b,double c)
	{
		
		System.out.println("Addition of three numbers is="+(20+30+40));
	}
	
	 void add(int a,int b)
	{
		System.out.println("Addition of int numbers is="+(20+30));
	}
	 public static void main(String[] args)
	{
		add(10,20,30);
		add(2.5,4);
		StatAndNonParaMethOV n1=new StatAndNonParaMethOV();
		n1.add(20,40,100.7);
		n1.add(100, 400);
	}
	
	
}
