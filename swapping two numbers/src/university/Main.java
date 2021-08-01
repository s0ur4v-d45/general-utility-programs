package university;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("initially before swapping:a="+a+" and b="+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("finally after swapping:a="+a+" and b="+b);

    }
}
