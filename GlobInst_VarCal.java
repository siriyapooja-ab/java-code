package module1programs;

import module2.InstanceGlob_Vr;

public class GlobInst_VarCal 
{
	public static void main(String[] args) 
	{
		InstanceGlob_Vr n=new InstanceGlob_Vr();
		int a=20;
		int z= a+n.a;
		System.out.println("Addition result=>"+z);
	}
}
