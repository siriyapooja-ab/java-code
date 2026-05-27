package module1programs;

public class NonParaConsOL
{
	NonParaConsOL()
	{
		System.out.println("This is non parameter");
	}
	NonParaConsOL(int a)
	{
		System.out.println("This is single int parameter");
	}
	NonParaConsOL(double a)
	{
		System.out.println("This is double parameter");
	}
	public static void main(String[] args) 
	{
		new NonParaConsOL();
		new NonParaConsOL(500);
		new NonParaConsOL(10.2);
		
	}
}
