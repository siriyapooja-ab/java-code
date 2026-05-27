package module1programs;

import java.util.ArrayList;

public class Upcasting_ArryProg
{
	public static void main(String[] args) 
	{
		ArrayList<Object> list= new ArrayList<>();
		
		list.add(10);
		list.add("Pooja");
		list.add('A');
		list.add(11.70);
		list.add(false);
		
		System.out.println(list);
		
		list.add(23);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		boolean b1=list.contains("Pooja");
		System.out.println(b1);
		
	}
	}
