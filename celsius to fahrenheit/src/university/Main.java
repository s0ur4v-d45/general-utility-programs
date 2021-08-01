package university;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        float c,f;
        System.out.print("enter temerature in centigrade:");
        c=sc.nextFloat();
       f=(1.8f*c) + 32.0f;                       //   f=(float)((1.8*c) + 32.0);
        System.out.println("temperature in fahrenheit is "+f);
    }
}
