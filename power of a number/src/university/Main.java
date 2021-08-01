package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);
        System.out.print("enter base and exponent:");
        int base=sc.nextInt();
        int exp= sc.nextInt();
        Example e=new Example();
        int result=e.pow(base,exp);
        System.out.println("the result is:"+result);
    }
}


class Example
{
    int res=1;
    int pow(int base,int exp)
    {
        for(int i=1;i<=exp;i++)
        {
            res=res*base;
        }
        return res;
    }
}