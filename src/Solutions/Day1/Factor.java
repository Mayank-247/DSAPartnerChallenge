package Solutions.Day1;

import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no.=");
        int n1=sc.nextInt();
        System.out.println("Enter second no.=");
        int n2=sc.nextInt();
        int hcf=HCF(n1,n2);
        System.out.println("HCF="+ hcf+" LCM="+((n1*n2)/ hcf));
    }
     static int HCF(int n1, int n2)
    {
        while(n2!=0)
        {
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        return n1;
    }
}