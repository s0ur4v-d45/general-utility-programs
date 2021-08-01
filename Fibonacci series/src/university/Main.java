package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a range upto which you want to print the fibonacci series=");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int third;
        System.out.print(first+" "+second+" ");
        int i=2;
        while(i!=n)
        {
            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
            i++;
        }

    }
}
