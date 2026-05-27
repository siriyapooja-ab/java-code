package module1programs;

import module2.AccessS_Global;

public class StatcGlobal_Vari extends AccessS_Global 
{
	static void add() 
	{
		int a=39;
		int b=AccessS_Global.a+AccessS_Global.b+a;
		System.out.println("Addition of variables is =>"+b);
	}
	public static void main(String[] args)
	{
		add();
		}
}
