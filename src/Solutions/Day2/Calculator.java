package Solutions.Day2;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.=");
        double n1 = sc.nextDouble();
        System.out.print("Enter 2nd no.=");
        double n2 = sc.nextDouble();
        System.out.print("Enter Operator (+, -, *, /)=");
        char ch = sc.next().charAt(0);
        sc.close();
        System.out.println(calc(n1,n2,ch)==-1?"Enter valid Operator!!!":"Your Answer is="+calc(n1,n2,ch));
    }

    static double calc(double n1, double n2, char ch)
    {
        if (ch == '+')
            return n1 + n2;
        else if (ch == '-')
            return n1 - n2;
        else if (ch == '*')
            return n1 * n2;
        else if (ch == '/')
            return n1 / n2;
        return -1;
    }
}
