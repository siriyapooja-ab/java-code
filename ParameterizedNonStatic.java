package module1programs;

public class ParameterizedNonStatic 
{
	void add(int a,int b)
	{
		System.out.println("Addition of two no's is="+(a+b));
	}
	
	void sub(double a,int b)
	{
		System.out.println("Substraction of two no's is=" +(a-b));
	}
	
	void mul(double a,double b)
	{
		System.out.println("Multiplication of two no's is ="+(20*10));
	}
	public static void main(String[] args)
	{
		ParameterizedNonStatic n1=new ParameterizedNonStatic ();
		n1.add(20,10);
		n1.sub(10.3, 2);
		n1.mul(10.2, 10.50);
		
	}
}
