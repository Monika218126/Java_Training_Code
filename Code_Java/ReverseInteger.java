// Q1. Reverse Integer with Overflow Handling
// Problem: Reverse a given integer. If the reversed integer overflows 32-bit signed integer range, print 0.

// Input: Integer n           Output: Reversed integer or 0



import java.util.Scanner;
public class ReverseInteger{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int rev=0;
        while (n != 0) {
            int digit = n % 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                rev = 0;
                System.out.println("Number OverFlow..");
                break;
            }

            rev = rev * 10 + digit;
            n /= 10;
        }

        System.out.println(rev);
        sc.close();
    }
}
