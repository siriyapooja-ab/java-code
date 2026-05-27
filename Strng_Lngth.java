package module1programs;

public class Strng_Lngth 
{
public static void main(String[] args) 
{
	String a=" Welcome World ";
	System.out.println(a.length());
	
	System.out.println(a.toLowerCase());
	System.out.println(a.toUpperCase());
	System.out.println(a.trim());
	System.out.println(a.charAt(4));
	System.out.println(a.indexOf('e'));
	System.out.println(a.substring(8));
	System.out.println(a.substring(8, 11));
	
	String b=" Welcome World ";
	boolean c=a.equals(b);
	System.out.println(c);
	
	boolean d=a.equalsIgnoreCase(b);
	System.out.println(d);
	
	boolean n=b.contains(a);
	System.out.println(n);
	
}
}
