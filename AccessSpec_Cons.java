package module1programs;

public class AccessSpec_Cons 
{
	public AccessSpec_Cons ()
	{
		System.out.println("Constructor 1");
	}
	protected AccessSpec_Cons (int a)
	{
		System.out.println("Constructor 2");
	}
	AccessSpec_Cons (int a,double b)
	{
		System.out.println("Constructor 3");
	}
	private AccessSpec_Cons (double a) 
	{
		System.out.println("Constructor 4");
	}
	public static void main(String[] args) 
	{
		new AccessSpec_Cons();
		new AccessSpec_Cons(100);
		new AccessSpec_Cons(10,20.3);
		new AccessSpec_Cons(20.89);
	}
}
