package module1programs;

public class NonStatic_2 
{
	void add()
	{
		System.out.println("Addition of two no's is="+(10+20));
	}
	
	void sub()
	{
		System.out.println("Substraction of two no's is=" +(20-10));
	}
	
	void mul()
	{
		System.out.println("Multiplication of two no's is ="+(20*10));
	}
	
	public static void main(String[] args) 
	{
		NonStatic_2 n=new NonStatic_2();
		n.add();
		n.sub();
		n.mul();
	}
}
