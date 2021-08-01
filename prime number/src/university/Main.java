package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the range in which you want to print all the prime numbers:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int j;
        for(int i=a;i<=b;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.println(i+" is a prime number.");
            }
            else
            {
                System.out.println(i+" is not a prime number.");
            }
        }
    }
}
