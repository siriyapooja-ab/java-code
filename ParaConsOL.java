package module1programs;

public class ParaConsOL
{
	 ParaConsOL(int a)
	 {
		 System.out.println("This is int type parameter of constructor ");
	 }
	 ParaConsOL(int a,int b)
	 {
		 System.out.println("This is int type with two parameters of constructor ");
	 }
	 ParaConsOL(double a)
	 {
		 System.out.println("This is double type parameter of constructor ");
	 }
	 ParaConsOL(double a,double b)
	 {
		 System.out.println("This is double type with two parameters of constructor ");
	 }
	 public static void main(String[] args)
	 {
		new ParaConsOL(100);
		new ParaConsOL(100,20);
		new ParaConsOL(100.5);
		new ParaConsOL(100.4,30.4);
	 }
}
