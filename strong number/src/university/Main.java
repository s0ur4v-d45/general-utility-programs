package university;
import java.util.Scanner;
class Example
{
    public int factorial(int n)
    {

        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
 public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
      Example e=new Example();
        int number=n;
        int res=0;
        while(number>0)
        {
            res+=e.factorial(number%10);
            number/=10;
        }
        if(res==n)
        {
            System.out.println(n+" is a strong number.");
        }
        else
        {
            System.out.println(n+" is not a strong number");
        }

    }

}
