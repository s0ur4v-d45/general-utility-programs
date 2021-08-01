package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String str,rev="";
        System.out.print("enter a string which you want to check that it is palindrome or not:");
        str=sc.nextLine();
        int length=str.length();
        int i;
        for (i=length-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("yes" +
                    " it is palindrome");
        }
        else
        {
            System.out.println(" no it is not a palindrome");
        }
    }
}
