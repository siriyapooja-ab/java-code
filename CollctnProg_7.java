package module1programs;

import java.util.ArrayList;

public class CollctnProg_7 
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
		
		a1.remove(4);
		System.out.println(a1);
	}
}
