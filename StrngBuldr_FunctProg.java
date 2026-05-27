package module1programs;

public class StrngBuldr_FunctProg
{
	public static void main(String[] args)
	{
		StringBuilder s1=new StringBuilder();
		
		s1.append("Welcome World");
		System.out.println(s1);
		
		s1.insert(8, "To ");
		System.out.println(s1);
		
		
		s1.replace(11,17,"JAVA");
		System.out.println(s1);
		
		s1.delete(7,10);
		System.out.println(s1);
		
		System.out.println(s1.capacity());
		
		s1.ensureCapacity(20);
		System.out.println(s1.capacity());
		
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.length());
		
		System.out.println(s1.substring(7));
	
		System.out.println(s1.substring(0, 7));
		
		s1.reverse();
		System.out.println(s1);
		
		}
}
