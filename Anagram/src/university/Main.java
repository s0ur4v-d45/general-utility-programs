package university;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    static boolean isAnagram(String str1,String str2)
    {
        str1=str1.replaceAll("\\s","");
        str2=str2.replaceAll("\\s","");
        if(str1.length()!=str2.length())
        {
            return false;
        }
        else
        {
            // Convert both Strings into lower case and into Character Array
            char[] arr1 = str1.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();

            // Sort both Character Array
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Check if both arrays are equal
            return (Arrays.equals(arr1, arr2));
        }

    }


    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        System.out.print("enter two strings");
        str1=sc.nextLine();
        str2=sc.nextLine();
        boolean bool=isAnagram(str1,str2);
        if(bool==true)
        System.out.println("the string:("+str1+") and string:("+str2+") are anagram.");
        else
        {
            System.out.println("not anagram.");
        }
    }
}
