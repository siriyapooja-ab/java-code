package module1programs;

public class StatAndNonStatNonParaMO 
{
	static void add()
	{
		System.out.println("This is static non parametrized method ");
	}
	
	void add(int a)
	{
		System.out.println("This is non static  parametrized method ");
	}
	public static void main(String[] args)
	{
		add();
		
		StatAndNonStatNonParaMO n1=new StatAndNonStatNonParaMO();
		n1.add(10);
	}
	
}
