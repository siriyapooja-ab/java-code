package module1programs;


import java.util.Arrays;

public class tochrArry_Strng 
{
	public static void main(String[] args) 
	{
		String a="Pooja Siriya";
		
		char[]c1=a.toCharArray();
		
		//System.out.println(c1);
		
	for(int i=0;i<a.length();i++)
		{
			System.out.println(c1[i]);
		}
		
		System.out.println(Arrays.toString(c1));

	}
}

