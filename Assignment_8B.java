package module1programs;

public class Assignment_8B 
{
	static void circOfCircle()
	{
		int r=20;
		double circuOfCircle=2+Math.PI+r;
		System.out.println("Circumference of circle="+circuOfCircle);
		
	}
	static void circOfTriangle()
	{
		int a=20;
		int b=10;
		int c=50;
		double circuOfTriangle=a+b+c;
		System.out.println("Circumference of Triangle="+circuOfTriangle);
		
	}
	static void circOfSquare()
	{
		int a=20;
		double circuOfSuare=4*a;
		System.out.println("Circumference of Square="+circuOfSuare);
		
	}
	static void circOfRect()
	{
		int a=20;
		int b=50;
		double circuOfRectangle=2*(a+b);
		System.out.println("Circumference of Rectangle="+circuOfRectangle);
		
	}
	public static void main(String[] args) 
	{
		circOfCircle();
		circOfTriangle();
		circOfSquare();
		circOfRect();
		
	}
	
	
}
