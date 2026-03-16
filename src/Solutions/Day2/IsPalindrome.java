package Solutions.Day2;

import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String=");
        String s= sc.nextLine();
        sc.close();
        s= s.toLowerCase();
        System.out.println(isPalindrome(s)?"String is Palindrome":"String is not Palindrome");
    }
    static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}