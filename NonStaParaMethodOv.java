package module1programs;

public class NonStaParaMethodOv 
{
	void add(int a,int b,int c)
	{
		
		System.out.println("Addition of three numbers is="+(20+30+40));
	}
	
	 void add(int a,int b)
	{
		System.out.println("Addition of int numbers is="+(20+30));
	}
	
	 void add(double a,int b)
	{
		System.out.println("Addition of int and doble numbers is="+(20+30));
	}
	 public static void main(String[] args) 
	{
		 NonStaParaMethodOv n1=new NonStaParaMethodOv();
		 n1.add(10, 200, 270);
		 n1.add(58, 20);
		 n1.add(92.6, 20);
	}	
}
