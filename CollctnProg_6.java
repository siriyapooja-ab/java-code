package module1programs;

import java.util.ArrayList;

public class CollctnProg_6 
{
public static void main(String[] args)
{
	ArrayList<Object> a1= new ArrayList<>();
	
	
	a1.add(10);
	a1.add(true);
	a1.add("Pooja");
	a1.add(10.45);
	a1.add('A');
	System.out.println(a1);
	
	ArrayList<Object> b1= new ArrayList<>();
	
	
	b1.add(10);
	b1.add(true);
	b1.add("Pooja");
	b1.add(10.45);
	b1.add('A');
	System.out.println(b1);
	
	boolean c=a1.containsAll(b1);
	System.out.println(c);
}
}
