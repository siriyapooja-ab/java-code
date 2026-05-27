package module1programs;

public class NonStatAccss_prog1
{
public void add()
{
	System.out.println("Addition method");
}
protected void sub()
{
	System.out.println("Substraction method");
}
 void mul()
{
	System.out.println("Multiplication mthod");
}
private void div()
{
	System.out.println("Division mthod");
}
public static void main(String[] args)
{
	NonStatAccss_prog1 n1=new NonStatAccss_prog1();
	n1.add();
	n1.sub();
	n1.mul();
	n1.div();
}
}
