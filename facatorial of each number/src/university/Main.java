package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the limit upto which you want to print the factorials:");
        int n=sc.nextInt();
        Example e=new Example();
        for(int i=0;i<=n;i++)
        {
            int x=e.factorial(i);
            System.out.println("the factorial of "+i+" is "+x);
        }

    }

}



class Example
{

    public int factorial(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact*=i;
        }
        return fact;
    }
}