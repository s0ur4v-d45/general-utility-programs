package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a 3 digit number:");
        int temp,number,res=0;
        int n= sc.nextInt();
        number=n;
        for(;number>0;number/=10)
        {
            temp=number%10;
            res+=temp*temp*temp;
        }
        if(res==n) {
            System.out.println(n + " is an armstrong number.");
        }
        else
        {
            System.out.println(n+" is not an armstrong number.");
        }
    }
}
