package Solutions.Day2;

import java.util.Scanner;
public class Fibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms in Fibonacci Series: ");
        int n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }

    static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Enter a valid number.");
            return;
        }
        int a = 0, b = 1, temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            temp = a;
            a = b;
            b = temp + b;
        }
    }
}