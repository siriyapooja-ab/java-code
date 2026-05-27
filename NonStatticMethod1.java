package module1programs;

public class NonStatticMethod1 
{
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		NonStatticMethod1 n=new NonStatticMethod1();
		n.add();
		
	}
}
