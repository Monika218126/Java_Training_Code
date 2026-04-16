// Q2. Armstrong Number (Dynamic Digits)
// Problem: Check if a number is an Armstrong number for any number of digits.

// Input: Integer n           Output: Armstrong / Not Armstrong


import java.util.Scanner;

public class Armstrong {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
// 153
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            /*
            // power calculation (without Math.pow)
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            n /= 10;
            }
            */

            n /= 10;
        }

        if (sum == original) 
            System.out.println(sum + " is Armstrong Number");
        else  
            System.out.println(original + " is Not Armstrong Number");
        sc.close();
    }
}