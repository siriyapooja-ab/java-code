package module1programs;
import java.util.Scanner;
public class AreaAndCurumScanner
{
	static void areaCal()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of r");
		int r=s1.nextInt();
		System.out.println("Area of circle is="+(3.14*r*r));
		
		System.out.println("Enter value of breath");
		int b=s1.nextInt();
		System.out.println("Enter value of height");
		int h=s1.nextInt();
		System.out.println("Area of Triangle is ="+(0.5*b*h));
		
		System.out.println("Enter value of a1");
		int a1=s1.nextInt();
		System.out.println("Area of Squre is="+a1*a1);
		
		System.out.println("Enter value of a2");
		int a2=s1.nextInt();
		System.out.println("Enter value of b2");
		int b2=s1.nextInt();
		System.out.println("Area of Rectangle is="+a2*b2);
		s1.close();
	}
	static void circumCal()
	{
		Scanner s2=new Scanner(System.in);
		
		System.out.println("Enter value of r");
		int r=s2.nextInt();
		System.out.println("Circumference of cicle is="+(2*3.14*r*r));
		
		
		System.out.println("Enter value of a");
		int a=s2.nextInt();
		System.out.println("Enter value of b");
		int b=s2.nextInt();
		System.out.println("Enter value of c");
		int c=s2.nextInt();
		System.out.println("Circumference of Triangle is="+(a+b+c));
		
		System.out.println("Enter value of a2");
		int a2=s2.nextInt();
		System.out.println("Circumference of Square  is="+4*a2 );
		
		System.out.println("Enter value a3");
		int a3=s2.nextInt();
		System.out.println("Enter value b3");
		int b3=s2.nextInt();
		System.out.println("Circumference of Rectangle is="+2*(a3+b3));
		s2.close();
		
	}
	
	
	

	public static void main(String[] args)
	{
		areaCal();
		circumCal();
		
	}
}
