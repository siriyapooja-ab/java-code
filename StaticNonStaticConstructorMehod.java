package module1programs;

public class StaticNonStaticConstructorMehod 
{
	static void add()
	{
		System.out.println("This s static method");
	}
	void sub()
	{
		System.out.println("This is non static method");
	}
	StaticNonStaticConstructorMehod ()
	{
		System.out.println("This is constuctor");
	}
		public static void main(String[] args) 
		{
			add();
			StaticNonStaticConstructorMehod n1=new StaticNonStaticConstructorMehod ();
			n1.sub();
			
		}

}
