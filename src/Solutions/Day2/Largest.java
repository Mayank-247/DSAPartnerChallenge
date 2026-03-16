package Solutions.Day2;

import java.util.Scanner;
public class Largest {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.=");
        double n1 = sc.nextDouble();
        System.out.print("Enter 2nd no.=");
        double n2 = sc.nextDouble();
        sc.close();
        System.out.println(n1>n2?"First No. is Largest="+n1:"Second is Largest="+n2);
    }
}