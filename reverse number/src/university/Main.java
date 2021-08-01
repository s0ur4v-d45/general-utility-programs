package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=sc.nextInt();
        int a,d=0;
        while(n>0)
        {
            a=n%10;
            d=(d*10)+a;
            n/=10;
        }
        System.out.println("the reversed number is:"+d);
    }
}
