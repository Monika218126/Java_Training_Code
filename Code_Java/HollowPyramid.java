// Q14. Hollow Pyramid Pattern
// Problem: Print hollow pyramid pattern for given N.

// Input: Integer N          Output: Pattern


import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // stars + hollow
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
            sc.close();
        }
    }
}