package module1programs;

public class Amazon
{
	static void add(int a)
	{
		System.out.println("This s static method");
	}
	void sub(int b)
	{
		System.out.println("This is non static method");
	}
	Amazon (int c)
	{
		System.out.println("This is constuctor");
	}
	public static void main(String[] args) 
	{
		add(10);
		Amazon a=new Amazon(10);
		a.sub(2);
		
		
		
	}
}
