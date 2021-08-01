package university;
import java.util.Scanner;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of terms out of which you want to find out the maximum among them=");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("the largest number is="+max);
    }
}
