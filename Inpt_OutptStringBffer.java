package module1programs;

public class Inpt_OutptStringBffer 
{
	public static void main(String[] args)
	{
		StringBuffer input=new StringBuffer("Manish Kumar Tiwari");
		
		input.delete(1, 6);
		
		input.delete(3,7);
		
		input.delete(5,11);
		
		for(int i=0;i<input.length();i++)
		{
			char c1=input.charAt(i);
			
			System.out.println(c1);
		}
		
		
		
	}
}
