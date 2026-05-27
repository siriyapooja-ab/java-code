package module1programs;

public class MathClassMethods 
{
	public static void main(String[] args)  
	{
		int sum=Math.addExact(10, 20);
		System.out.println(sum);
		
		long sub=Math.subtractExact(100, 99);
		System.out.println(sub);
		
		int mul=Math.multiplyExact(100, 200);
		System.out.println(mul);
		
		int min=Math.min(500, 200);
		System.out.println(min);
		
		int max=Math.max(700, 300);
		System.out.println(max);
		
		int abs=Math.abs(-100);
		System.out.println(abs);
		
		double sqrt=Math.sqrt(100);
		System.out.println(sqrt);
		
		double random=Math.random();
		System.out.println(random);
		
		
	}

}
