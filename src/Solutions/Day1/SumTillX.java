package Solutions.Day1;

import java.util.Scanner;
public class SumTillX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0.0;
        while(true)
        {
            System.out.print("Enter no.=");
            String s=sc.next();
            if(s.equals("x"))
                break;
            sum += Double.parseDouble(s);
        }
        System.out.println("Sum till x="+sum);
    }
}