package module1programs;

public class Assignment_9 
{
	static double a=3.14;
	static void areaCal()
	{
	
		double r=10;
		double areaOfCircle=a*r*r;
		System.out.println("Area of circle is="+areaOfCircle);
	
	
		double b=2;
		double h=5;
		double areaOfTriangle= 0.5*b*h;
		System.out.println("Area of triagle="+areaOfTriangle);
	
	
	
		int c=10;
		int areaOfSquare=c*c;
		System.out.println("Area Of Square="+areaOfSquare);
		
	
	
		int d=10;
		int e=30;
		int areaOfRect=2*(d*e);
		System.out.println("Area Of Square="+areaOfRect);
	}
	static void CrcumCal()
	{
		int r=20;
		double circuOfCircle=2+a+r;
		System.out.println("Circumference of circle="+circuOfCircle);
		
	
		int a1=20;
		int b=10;
		int c=50;
		double circuOfTriangle=a1+b+c;
		System.out.println("Circumference of Triangle="+circuOfTriangle);
		
	
		int a2=20;
		double circuOfSuare=4*a2;
		System.out.println("Circumference of Square="+circuOfSuare);
		
	
		int a3=20;
		int b1=50;
		double circuOfRectangle=2*(a3+b1);
		System.out.println("Circumference of Rectangle="+circuOfRectangle);
		
	}
	
	public static void main (String[] args)
	{
		areaCal();
		CrcumCal();
	}
	
	

}
