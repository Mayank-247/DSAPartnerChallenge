package Solutions.Day2;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {

            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);

            num /= 10;
        }

        return sum == original;
    }
}