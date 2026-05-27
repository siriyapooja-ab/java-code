package module1programs;
import java.util.Scanner;
public class ScannerProgram
{
    public static void main(String[] args) 
    {
    

    Scanner s1=new Scanner(System.in);
    
    System.out.println("Enter the first value");
    int a=s1.nextInt();
    System.out.println("Enter the second value");
    int b=s1.nextInt();
    
    int c=a*b;
    System.out.println("Result is ="+c);
     
    s1.close();
            
            
    }

}
