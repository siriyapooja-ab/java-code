package module1programs;

import module2.InstanceGlob_Vr;

public class GlobInst_Vr1 extends InstanceGlob_Vr
{
	public static void main(String[] args) 
	{
		GlobInst_Vr1 n=new GlobInst_Vr1();
		int z=n.a+n.b;
		System.out.println("Addition result is=>"+z);
	}
	
}
