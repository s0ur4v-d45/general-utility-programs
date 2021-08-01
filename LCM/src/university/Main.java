package university;
import java.util.Scanner;
public class Main {

    public static int lcm(int a,int b)
    {
        int small,large;
        if(a>b)
        {
            large=a;
            small=b;
        }

        else {
            large=b;
            small=a;
        }
        int min=small;
        while(true)
        {
            if(min%large==0)
            {
                return min;
            }
            min=min+small;
        }



    }


    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=lcm(a,b);
        System.out.println("LCM of "+a+" and "+b+" is: "+c);
    }
}
