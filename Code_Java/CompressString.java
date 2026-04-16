// Q13. String Compression
// Problem: Compress string like aabcc -> a2b1c2

// Input: String s           Output: Compressed string


import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String result = "";
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result += s.charAt(i - 1) + "" + count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + result);
        sc.close();
    }
}