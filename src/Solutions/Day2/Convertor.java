package Solutions.Day2;

import java.util.Scanner;
public class Convertor {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rupees=");
        double n1 = sc.nextDouble();
        System.out.printf("Your Rupees in Dollars will be= %.3f$",(n1/83.5));
        sc.close();
    }
}