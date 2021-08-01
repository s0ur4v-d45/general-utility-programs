package university;
import java.util.Scanner;
public class Main {
    public static int hcf(int a,int b)
    {
        int small,large,temp=1;
        if(a>b)
        {
            large=a;
            small=b;
        }
        else
        {
            large=b;
            small=a;
        }

        while(small!=0)
        {
            temp=small;
            small=large%small;
            large=temp;
        }
        return large;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("HCF of "+a+" and "+b+" is "+hcf(a,b));
    }
}
