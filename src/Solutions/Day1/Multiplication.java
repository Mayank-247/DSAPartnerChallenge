package Solutions.Day1;

import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.=");
        int n1=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
        }
    }
}