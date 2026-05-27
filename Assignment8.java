package module1programs;

public class Assignment8 
{
	static void areaOfCir()
	{
		double r=10;
		
		double areaOfCircle=Math.PI*r*r;
		System.out.println("Area of circle is="+areaOfCircle);
	}
	
	static void areaOfTri()
	{
		double b=2;
		double h=5;
		double areaOfTriangle= 0.5*b*h;
		System.out.println("Area of triagle="+areaOfTriangle);
	}
		
	static void areaOfSqu()
	{
		int a=10;
		int areaOfSquare=a*a;
		System.out.println("Area Of Square="+areaOfSquare);
		
	}
	static void areaOfRect()
	{
		int a=10;
		int b=30;
		int areaOfSquare=a*b;
		System.out.println("Area Of Square="+areaOfSquare);
	}
	public static void main (String[] args)
	{
		areaOfCir();
		areaOfTri();
		areaOfSqu();
		areaOfRect();
	}
}
