package module1programs;
import module2.AccessS_Global ;

public class StatGlob_VariAccess 
{
	static void add()

	{
		int e=20;
		int z=AccessS_Global.a+e;
		System.out.println("Addition is =>"+z);
	}
	public static void main(String[] args)
	{
		add();	
	}
	
}
