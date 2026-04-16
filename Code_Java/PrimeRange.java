// Q4. Prime in Range with Count
// Problem: Print all prime numbers from 1 to N and also count them.
// Input: Integer N       Output: List of primes and count

import java.util.Scanner;
public class PrimeRange {
   
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int j=0;j<=n;j++){
            for (int  i= 2; i <= j;i++) {
                if (j % i == 0) {
                    count++;
                }
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}



