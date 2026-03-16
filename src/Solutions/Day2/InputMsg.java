package Solutions.Day2;

import java.util.Scanner;
public class InputMsg {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name=");
        String s=sc.nextLine();
        System.out.printf("Hello %s, Welcome to DSA challange!",s);
    }
}
