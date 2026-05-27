package module1programs;

 class P1
{
	final void add()
	{
		System.out.println("This mthod is not overridden");
	}
}	
public class Final_keyProg extends P1
{
	void add(int a)
	{
		System.out.println("This is child class method");
	}
	public static void main(String[] args) 
	{
		Final_keyProg f=new Final_keyProg();
		f.add();
		f.add(100);
	
	}
}
