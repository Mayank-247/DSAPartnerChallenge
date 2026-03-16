package Solutions.Day2;

import java.util.Scanner;
public class OddEven {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.=");
        int n=sc.nextInt();
        sc.close();
        System.out.println((n&1)==1?"No. is odd":"No. is Even");
    }
}
