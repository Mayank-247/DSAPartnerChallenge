package Solutions.Day1;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year=");
        int n=sc.nextInt();
        boolean isLeap = (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
        System.out.println(isLeap ? "Leap Year" : "Not Leap Year");
    }
}