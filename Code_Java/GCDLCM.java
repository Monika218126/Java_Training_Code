// Q5. GCD and LCM without Built-in
// Problem: Find GCD and LCM of two numbers using logic only.
// Input: Two integers a, b           Output: GCD and LCM

import java.util.Scanner;

public class GCDLCM {

    // Function to find GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcdValue = gcd(a, b);

        int lcm = (a * b) / gcdValue;

        System.out.println("GCD: " + gcdValue);
        System.out.println("LCM: " + lcm);
        sc.close();
    }
}