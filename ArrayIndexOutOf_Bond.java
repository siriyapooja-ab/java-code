package module1programs;

import java.util.Arrays;

public class ArrayIndexOutOf_Bond 
{
	public static void main(String[] args)
	{
		int [] a=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(Arrays.toString(a)); 
		
		try {
			
			a[3]=40;
			
			}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			
		System.out.println("Please enter values till given index");
		
		
	}

	
	}
}
