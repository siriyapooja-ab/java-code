package module1programs;

public class MathCLassPogram 
{
	static void areaCal()
	{
		int mul=Math.multiplyExact(4,4);
		System.out.println("Area of cirle="+mul*Math.PI);
		
		int mul1=Math.multiplyExact(10, 98);
		System.out.println("Area of Trianle="+(0.5*mul1));
		
		int mul2=Math.multiplyExact(10, 20);
		System.out.println("Area of Square="+mul2);
	
		int mul4=Math.multiplyExact(29, 38);
		System.out.println("Area of Rectangle ="+2*mul4);
	
	
	}
	static void CircumCal()	
	{
		int add=Math.addExact(2, 8);
		System.out.println("Circumference of circle="+(add+2));
		
		int add1=Math.addExact(56, 98);
		System.out.println("Circumference of Triangle="+(add1+7));
		
		
		int mul=Math.multiplyExact(4,67);
		System.out.println("Circumference of Square="+mul);
		
		
		int add4=Math.addExact(18,84);
		System.out.println("Circumference of circle="+(2*add4));
		
		
	}
	public static void main(String[] args) 
	{
		areaCal();
		CircumCal()	;
	}
}
