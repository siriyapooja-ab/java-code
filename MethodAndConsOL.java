package module1programs;

public class MethodAndConsOL
{
	static void add(int a,int b,int c)
	{
		
		System.out.println("Addition of three numbers is="+(20+30+40));
	}
	
	static void add(int a,int b)
	{
		System.out.println("Addition of int numbers is="+(20+30));
	}
	
	static void add(double a,int b)
	{
		System.out.println("Addition of int and doble numbers is="+(20+30));
	}
	
	 MethodAndConsOL(int a)
	 {
		 System.out.println("This is int type parameter of constructor ");
	 }
	 MethodAndConsOL(int a,int b)
	 {
		 System.out.println("This is int type with two parameters of constructor ");
	 }
	 MethodAndConsOL(double a)
	 {
		 System.out.println("This is double type parameter of constructor ");
	 }
	 public static void main(String[] args)
	 {
		 add(10,38,99);
		 add(10,40);
		 add(10.5,38);
		 new MethodAndConsOL(10);
		 new MethodAndConsOL(10,87);
		 new MethodAndConsOL(10.45);
		 
	 }
}
