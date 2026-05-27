package module1programs;

public class DiffnMethd_StringBffer 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer();
		s1.append("Hello");
		System.out.println(s1);
		
		s1.insert(5, " World");
		System.out.println(s1);
		
		s1.replace(5, 11, " Java");
		System.out.println(s1);
		
		s1.delete(6, 11);
		System.out.println(s1);
		
		
		System.out.println(s1.capacity());
		
		s1.ensureCapacity(30);
		System.out.println(s1.capacity());
		
		System.out.println(s1.charAt(1));
		
		s1.reverse();
		System.out.println(s1);
		
		System.out.println(s1.length());
		
		
	
		
	}
}
