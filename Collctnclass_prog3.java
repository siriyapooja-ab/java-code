package module1programs;

import java.util.ArrayList;

public class Collctnclass_prog3 
{
public static void main(String[] args) 
{
	ArrayList<Object> a1= new ArrayList<>();
	
	a1.add(10);
	a1.add(true);
	a1.add("Pooja");
	a1.add(10.45);
	a1.add('A');
	
	ArrayList<Object> b1= new ArrayList<>();
	
	b1.add(20);
	b1.add(false);
	b1.add("Sunny");
	b1.add(40.45);
	b1.add('Z');
	
	a1.addAll(b1);
	System.out.println(a1);
	
}
}
