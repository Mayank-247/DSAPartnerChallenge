package Solutions.Day2;

import java.util.Scanner;
public class SI {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal Amount=");
        double p= sc.nextDouble();
        System.out.print("Enter time=");
        int t= sc.nextInt();
        System.out.print("Enter rate in %=");
        double r= sc.nextDouble();
        sc.close();
        double si= (p*r*t)/100;
        System.out.println("Your Simple Interest is="+si);
    }
}
